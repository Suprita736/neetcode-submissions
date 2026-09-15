class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,j = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i] != val && nums[j] != val){
                i++;
                j++;
            }
            else if(nums[i] == val && nums[j] == val) j++;
            else if(nums[i] == val && nums[j] != val) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
        }
        return i;
    }
}