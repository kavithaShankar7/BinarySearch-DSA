public int[] getFloorAndCeil(int[] nums, int x) {
       int low = 0;
       int high = nums.length -1;
       int floor = -1;
       int ceil = nums.length;
       while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid] >= x){
            ceil = nums[mid];
            high = mid -1;
        } else {
            low = mid + 1;
        }
        if(nums[mid] <= x){
            floor = nums[mid];
            low = mid +1;
        }   else {
            high = mid -1;
        }
       }
       int result[] = new int[2];
       result[0] = floor;
       result[1] = ceil;
       return result;
    }
