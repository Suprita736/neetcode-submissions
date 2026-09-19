class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0,r = nums.length-1;
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] == target || nums[l] == target || nums[r] == target) return true;
            if(l < r && nums[l] == nums[r]){
                while(l < r && nums[l] == nums[r]) {
                    l++;
                    r--;
                }
            }
            else if(nums[mid] >= nums[l] && nums[mid] > nums[r]){
                if((target < nums[mid] && target < nums[l] && target <= nums[r]) || target > nums[mid]) l = mid + 1;
                else r = mid - 1;
            }
            else if(nums[mid] < nums[l] && nums[mid] <= nums[r]){
                if(target < nums[mid] || (target > nums[mid] && target >= nums[l] && target > nums[r])) r = mid-1;
                else l = mid + 1;
            }
            else {
                if(target > nums[mid]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return false;
    }
}