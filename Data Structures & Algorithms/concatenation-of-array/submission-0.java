class Solution {
    public int[] getConcatenation(int[] nums) {
        int j = nums.length;
        nums = Arrays.copyOf(nums, 2*nums.length);
        int i = 0;
        while(i < nums.length && j < nums.length){
            nums[j] = nums[i];
            i++;
            j++;
        }
        return nums;
    }
}