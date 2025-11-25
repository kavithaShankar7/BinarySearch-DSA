class Solution {
    public int bananaPerHour(int[] piles, int mid){
        int totalValue = 0;
        for(int i=0;i<piles.length;i++){
            totalValue += Math.ceil((double) piles[i] / (double) mid);
        }
        return totalValue;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        while(low<=high){
            int mid =(low+high)/2;
            int pilesPerHours = bananaPerHour(piles, mid);
            if(pilesPerHours <= h){
                ans = mid;
                high = mid - 1;
            }   else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
