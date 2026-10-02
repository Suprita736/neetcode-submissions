class Solution {
public static void BT(int n,int m,String s,String digits,List<String> l,String[] a) {
        if(s.length() == digits.length()){
            l.add(s);
            return;
        }
        for(int i = 0;i < a[digits.charAt(n) - '0'].length();i++) {
            BT(n+1,i,s + String.valueOf(a[digits.charAt(n) - '0'].charAt(i)),digits,l,a);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        if(digits.length() == 0) return l;
        String[] a = new String[10];
        a[2] = "abc";
        a[3] = "def";
        a[4] = "ghi";
        a[5] = "jkl";
        a[6] = "mno";
        a[7] = "pqrs";
        a[8] = "tuv";
        a[9] = "wxyz";
        BT(0,0,"",digits,l,a);
        return l;
    }
}
