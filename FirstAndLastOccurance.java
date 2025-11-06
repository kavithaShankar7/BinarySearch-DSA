class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int low = 0;
        int high = nums.length - 1;
        int low2 = 0;
        int high2 = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid -1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        while(low2 <= high2){
            int mid = (low2 + high2)/2;
            if(nums[mid] == target){
                last = mid;
                low2 = mid + 1;
            } else if(nums[mid] < target){
                low2 = mid + 1;
            } else {
                high2 = mid - 1;
            }
        }  
        int[] result = new int[2];
        result[0] = first;
        result[1] = last;      
        return result;
    }
}
