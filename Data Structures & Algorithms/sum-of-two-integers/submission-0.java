class Solution {
    public int getSum(int a, int b) {
        int x = 0,c = 0,a1 = 0,b1 = 0;
        for(int i = 0;i < 32;i++){
            a1 = (a >> i) & 1;
            b1 = (b >> i) & 1;
            if(a1 == 1 && b1 == 1){
                x = x | ((a1 ^ b1) << i);
                if(c == 1) x = x ^ (1 << i);
                c = 1;
            }
            else if(a1 == 0 && b1 == 1 || a1 == 1 && b1 == 0){
                x = x | ((a1 ^ b1) << i);
                if(c == 1){
                    x = x ^ (1 << i);
                    c = 1;
                } 
                else c = 0;
            }
            else if(a1 == 0 && b1 == 0){
                x = x | ((a1 ^ b1) << i);
                if(c == 1) x = x ^ (1 << i);
                c = 0;
            }
        }
        return x;
    }
}
