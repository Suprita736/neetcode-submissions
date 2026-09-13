class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j = i + 1,count = 1;
        while(i < nums.length && j < nums.length){
            if(nums[i] == nums[j]) j++;
            else if(nums[i] != nums[j]){
                if(i+1 == j){
                    i++;
                    j++;
                    count++;
                }
                else{
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                    count++;
                }
            }
        }
        nums = Arrays.copyOf(nums, count);
        return count;
    }
}