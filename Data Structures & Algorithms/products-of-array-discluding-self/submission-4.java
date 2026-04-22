class Solution {
    public int[] productExceptSelf(int[] nums) {
        long[] pre = new long[nums.length];
        long[] suf = new long[nums.length];
        pre[0] = nums[0];
        suf[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i] = (long)nums[i] * pre[i-1];
        }
        for(int j=nums.length-2;j >= 0;j--){
            suf[j] = suf[j+1] * (long)nums[j]; 
        }
       // if(pre[0] == 0 && suf[nums.length-1] == 0) return pre;
        for(int k=0;k<nums.length;k++){
            if(pre[k] == 0 && suf[k] == 0){
                if(k == 0) nums[k] = (int)suf[k+1];
                else if(k == nums.length-1) nums[k] = (int)pre[k-1];
                else nums[k] = (int)(pre[k-1] * suf[k+1]);
            }
            else
                nums[k] = (int)((pre[k] * suf[k])/(nums[k] * nums[k]));
        }
        return nums;
    }
}  
