class Solution {
    public int findMin(int[] a) {
        int st = 0,end = a.length-1,ans = Integer.MAX_VALUE;
        while(st <= end){
            int mid = (st + end)/2;
            if(a[mid] == a[st] && a[mid] == a[end]){
                if(ans == Integer.MAX_VALUE) ans = a[mid];
                else if(a[mid] < ans) ans = a[mid];
                break; 
            }
            else if((a[mid] >= a[st] && a[mid] < a[end]) || (a[mid] < a[st] && a[mid] <= a[end])){
                if(ans == Integer.MAX_VALUE) ans = a[mid];
                else if(a[mid] < ans) ans = a[mid];
                end = mid - 1;
            }
            else if((a[mid] >= a[st] && a[mid] > a[end]) || (a[mid] < a[st] && a[mid] >= a[end])){
                st = mid + 1;
            }
        }
        return ans;
    }
}
