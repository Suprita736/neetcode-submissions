class Solution {
    public int BS(int[] a, int st,int end, int target){
        if(st > end) return -1;
        int mid = st+(end -st)/2;
        if(a[mid] == target) return mid;
        else if(a[mid] > target) return BS(a, st,mid-1,target);
        else if(a[mid] < target) return BS(a, mid+1,end,target);
        return mid;
    }
    public int search(int[] a, int target) {
        int st = 0,end = a.length-1,ans = 0;
        if(a[st] < a[end]) return BS(a,st,end,target);
        while(st < end){
            int mid = st+(end-st)/2;
            if(a[mid] > a[end]) st = mid + 1;
            else end = mid;
        }
        ans = st;
        int arr1 = BS(a,0,ans-1,target);
        int arr2 = BS(a,ans,a.length-1,target);

        if(arr1 != -1) return arr1;
        else if(arr2 != -1) return arr2;
        return -1;
    }
}
