class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0; int high = mat[0].length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int maxRow = maxRow(mat, mid);
            int left = mid-1 >= 0 ? mat[maxRow][mid-1] : -1;
            int right = mid+1 <= high ? mat[maxRow][mid+1] : -1; 
            if(mat[maxRow][mid] >= left && mat[maxRow][mid] >= right){
                return new int[] {maxRow, mid};
            } else if(mat[maxRow][mid] < left)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return new int[] {-1,-1};
    }

    public int maxRow(int[][] mat, int col){
        int index = -1; int maxVal = 0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col] > maxVal){
                maxVal = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
