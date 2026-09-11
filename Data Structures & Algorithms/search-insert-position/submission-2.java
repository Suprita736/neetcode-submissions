class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0,j = nums.length-1;
        if(target == nums[j]) return j;
        if(target > nums[j]) return j+1;
        if(target <= nums[i]) return i;
        while(i < j){
            int mid = (i+j)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        if(target == nums[j]) return j;
        if(target > nums[j]) return j+1;
        if(target <= nums[i]) return i;
        return 0;
    }
}