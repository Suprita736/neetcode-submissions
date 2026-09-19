class Solution {
    public String convertToTitle(int columnNumber) {
        long q,r;
        String ans = "";
        if(columnNumber <= 26) return String.valueOf((char) ('A'+ columnNumber-1));
        r = (long)columnNumber % 26;
        q = (long)columnNumber / 26;
        while(q > 0){
            if(r == 0) {
                while(r == 0){
                 ans = "Z" + ans.substring(0);
                 q -= 1;
                if(q <= 26) {
                    ans = String.valueOf((char)('A'+ (int)q-1)) + ans.substring(0);
                    return ans;
                }
                else {
                    r = q % 26;
                    q = q / 26;
                }
            }
            }
            ans = String.valueOf((char)('A'+ (int)r-1)) + ans.substring(0);
            if(q <= 26) {
                ans = String.valueOf((char)('A'+ (int)q-1)) + ans.substring(0);
                break;
            }
            r = q % 26;
            q = q / 26;
        }
        return ans;
    }
}