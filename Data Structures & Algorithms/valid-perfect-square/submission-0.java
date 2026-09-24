class Solution {
    public boolean isPerfectSquare(int x) {
        long ans=0;
        long i = 1,j = x;
        while(i <= j){
            long mid = (i+j)/2;
            if(mid * mid == x){
                return true;
            }
            else if(mid * mid > x){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return false;
    }
}