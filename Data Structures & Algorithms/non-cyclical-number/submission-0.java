class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0, digit = 0;
        while(!hs.contains(ans)){
            if(ans != 0) hs.add(ans);
            ans = 0;
            while(n != 0){
                digit = n % 10;
                ans += (digit * digit);
                n /= 10;
            }
            if(ans == 1) return true;
            n = ans;
        }
        return false;
    }
}
