class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = Arrays.stream(position).max().getAsInt();
        int ans = 0;
        while(low<=high){
            int mid =(low+high)/2;
            if(possible(position,mid,m) == true){
                ans = mid > ans ? mid : ans;
                low = mid + 1;
            } else 
                high = mid -1;
        }
        return ans;
    }
    public boolean possible(int[] position, int mid, int m){
        int balls = 1;
        int last = position[0];
        for(int i = 1;i<position.length;i++){
            if((position[i] - last) >= mid){
                balls++;
                last = position[i];
                if(balls >= m)
                    return true;
            }
        }
        return false;
    }
}
