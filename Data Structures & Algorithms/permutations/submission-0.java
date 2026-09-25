class Solution {
    public void BT(int i,int[] nums,List<List<Integer>> ans,boolean[] check,List<Integer> a){
        if(check[i]) return;
        if(!check[i]){
            a.add(nums[i]);
            check[i] = true;
        }
        if(a.size() == nums.length){
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            check[i] = false;
            return;
        }
        for(int j = 0;j < nums.length;j++){
            BT(j,nums,ans,check,a);
        }
        a.remove(a.size()-1);
        check[i] = false;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        for(int i = 0;i < nums.length;i++){
            BT(i, nums, ans, check, new ArrayList<>());
        }
        return ans;
    }
}
