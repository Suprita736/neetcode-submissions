class Solution {
    public int hammingWeight(int n) {
        int t = n,r = 0,count = 0;
        while(t != 0){
            r = t % 2;
            if(r == 1) count++;
            t = t / 2;
        }
        return count;
    }
}
