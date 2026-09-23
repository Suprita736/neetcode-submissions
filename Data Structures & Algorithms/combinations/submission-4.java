class Solution {
    int i = 1;
    public void BT(int j,int n,int k,List<List<Integer>> ans,List<Integer> a,boolean[] check){
        if(i != k && j == n) return;
        if(i == k){
            if(!check[j]){
                check[j] = true;
                a.add(j);
                ans.add(new ArrayList<>(a));
                a.remove(a.size()-1);
            }
            return;
        }
        a.add(j);
        check[j] = true;
        i++;
        BT(j+1,n,k,ans,a,check);
        for(int x=j+1;x<=n;x++){
            if(!check[x]){
                BT(x,n,k,ans,a,check);
            } 
            check[x] = false;
        }
        i--;
        a.remove(a.size()-1);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] check = new boolean[n+1];
        for(int i = 1;i <= n;i++){
            BT(i,n,k,ans,new ArrayList<>(),check);
        }
        return ans;
    }
}