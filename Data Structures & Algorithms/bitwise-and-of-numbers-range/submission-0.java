class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int r = left,n= right - left +1;
        for(int i = 0;i < n;i++){
            r = r & left;
            left++;
        }
        return r;
    }
}