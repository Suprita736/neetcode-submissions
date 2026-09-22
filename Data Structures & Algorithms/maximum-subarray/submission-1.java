class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int i = 0,j = 0,current = 0;
        current = nums[0];
        int max = current;
        while(i < nums.length && j < nums.length){
            if(current >= nums[j]){
                if(j != nums.length-1) current += nums[++j];
                else j++;
            }
            else {
                current -= nums[i++];
            }
            max = Math.max(max, current);
        }
        return max;
    }
}
