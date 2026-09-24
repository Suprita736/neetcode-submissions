class Solution {
    public void BT(int l,int r,List<String> ans,String st,String s,int n){
        if(st.equals("(")){
            if(l < 0) return;
            else{
                s = s.substring(0) + "(";
            }
        }
        if(st.equals(")")){
            if(r < 0) return;
            else{
                s = s.substring(0) + ")";
            }
        }
        if(l == 0 && r==0){
            ans.add(s);
            return;
        }
        BT(l-1,r+1,ans,"(",s,n);
        BT(l,r-1,ans,")",s,n);
        s = s.substring(0,s.length() - 1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s = "";
        int l = n;
        BT(l-1,1,ans,"(",s,n);
        return ans;
    }
}
