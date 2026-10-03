class Solution {
    int Txor = 0;
    public void BT(int n,int[] nums,int xor){
        if(n == nums.length){
            Txor += xor;
            return;
        }
        xor = xor ^ nums[n];
        BT(n+1,nums,xor);
        xor = xor ^ nums[n];
        BT(n+1,nums,xor);
    }
    public int subsetXORSum(int[] nums) {
        BT(0,nums,0);
        return Txor;
    }
}