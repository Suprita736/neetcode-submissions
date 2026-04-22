class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().replaceAll("\\s+", "").toLowerCase();
        int i=0,j=s.length()-1;
        while(i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!(ci >= 'a' && ci <= 'z' || ci >= '0' && ci <= '9') ) i++;
            if(!(cj >= 'a' && cj <= 'z' || cj >= '0' && cj <= '9')) j--;
            if(i <= j && s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
