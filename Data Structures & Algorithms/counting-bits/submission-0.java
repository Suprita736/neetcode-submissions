class Solution {
    public int[] countBits(int n) {
        int count = 0;
        int[] a = new int[n+1];
        while(n >= 0){
            for(int i = 0;i < 32;i++){
                if(((n >> i) & 1) == 1) count++;
            }
            a[n--] = count;
            count = 0;
        }
        return a;
    }
}
