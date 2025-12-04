class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = -1;
        for(int i : nums){
            low = i > low ? i : low;
            high += i;
        }
        if(k > nums.length)
            return -1;
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println(mid);
            if(subArrayfn(nums, mid, k) <= k){
                ans = mid;
                high = mid -1;
            } else 
                low = mid + 1;
        }
        return ans;
    }
    public int subArrayfn(int[] nums, int mid, int k){
        int result = 1;
        int sum = 0;
        for(int i: nums){
            if(sum + i <= mid)
                sum += i;
            else {
                result++;
                sum = i;
            }
        }
        return result;
    }
}
