public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int result = nums.length;
        while(low<=high){
            int m = (low+high)/2;
            if(nums[m] >= target){
                result = m;
                high = m-1;
            } else {
                low = m+1;
            }
        }
        return result;
    }
