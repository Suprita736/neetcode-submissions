class Solution {
    public void BT(int[] candidates, int target,int sum,List<Integer> a,List<List<Integer>> l,int m){
        if(sum > target){
            return;
        }
        if(sum == target){
             l.add(new ArrayList<>(a));
             return;
        }
        for(int i=m;i<candidates.length;i++){
            a.add(candidates[i]);
            BT(candidates,target,sum+candidates[i],a,l,i);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        BT(candidates,target,0,new ArrayList<>(),l,0);
        return l;
    }
}