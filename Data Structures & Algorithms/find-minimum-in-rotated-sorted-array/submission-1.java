class Solution {
    public int findMin(int[] a) {
        int st = 0,end = a.length-1,ans = 0;
        while(st < end){
            int mid = st+(end-st)/2;
            if(a[mid] > a[end]){
                st = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return a[st];
    }
}
