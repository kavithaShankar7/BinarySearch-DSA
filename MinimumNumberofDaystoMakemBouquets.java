class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        if(bloomDay.length < m*k) return -1;
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println(mid);
            int numberOfBouquets = possibleBouquets(bloomDay, m, k, mid);
            System.out.println(numberOfBouquets);
            if(numberOfBouquets >= m){
                ans = mid;
                high = mid - 1;
            }  else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int possibleBouquets(int[] bloomDay, int bouq, int flowers, int days){
        int result = 0;
        int r = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= days){
                r = r + 1;
                if(r == flowers){
                    result += 1;
                    r = 0;
                }
            } else {
                r = 0;
            }
        }
        return result;
    }
}
