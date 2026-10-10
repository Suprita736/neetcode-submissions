class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int r = left,n= right - left +1;
        while(left <= right){
            r = r & left;
            r = r & right;
            left++;
            right--;
        }
        return r;
    }
}