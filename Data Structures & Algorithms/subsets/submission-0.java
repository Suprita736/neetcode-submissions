class Solution {
    int i = 0;
    public void sub(List<Integer> a,List<List<Integer>> ans,boolean[] check,int[] nums){
        if(!check[i]){
            a.add(nums[i]);
            check[i] = true;
        }
        i++;
        if(i >= nums.length){
            List<Integer> copy = new ArrayList<>(a);
            ans.add(copy);
            return;
        }
        sub(a,ans,check, nums);
        a.remove(a.size()-1);
        i--;
        sub(a,ans,check, nums);
        i--;
        check[i] = false;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            sub(a,ans,check, nums);
            a.remove(a.size()-1);
        }
        ans.add(a);
        return ans;
    }
}
