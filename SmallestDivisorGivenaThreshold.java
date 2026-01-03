class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = 1;
        while(low<=high){
            int mid =(low+high)/2;
            System.out.println(mid);
            int result = divisor(nums, mid);
            System.out.println(result);
            if(result <= threshold){
                ans = mid;
                high = mid - 1;
            }   else 
                    low = mid +1;
        }
        return ans;
    }
    public int divisor(int[] nums, int mid){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result + (int) Math.ceil((double) nums[i] / (double) mid);
        }
        return result;
    }
}
