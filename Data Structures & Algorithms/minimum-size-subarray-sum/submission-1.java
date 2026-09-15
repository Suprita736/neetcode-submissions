class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE,i = 0,j = 0,sum = 0;
        // for(int k = 1;k < nums.length;k++){
        //     nums[k] += nums[k-1];
        // }
        sum = nums[i];
        while(i < nums.length && j < nums.length){
            if(sum < target){
                j++;
                if(j < nums.length) sum += nums[j];
            }
            else if(sum >= target){
                sum -= nums[i];
                count = Math.min(count, j - i + 1);
                i++;
            }
        }
        if(count == Integer.MAX_VALUE) count = 0;
        return count;
    }
}