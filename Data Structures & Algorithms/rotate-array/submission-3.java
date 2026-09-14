class Solution {
    public void rotate(int[] nums, int k) {
        if(k % nums.length == 0) return;
        k = k % nums.length;
        int i = 0,j = nums.length-k-1,l = nums.length-k,m = nums.length - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        while(l < m){
            int temp = nums[l];
            nums[l] = nums[m];
            nums[m] = temp;
            l++;
            m--;
        }
        i = 0;
        j = nums.length - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}