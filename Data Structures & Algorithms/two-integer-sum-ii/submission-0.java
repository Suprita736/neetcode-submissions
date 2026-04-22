class Solution {
    public int[] twoSum(int[] a, int target) {
        int i=0,j=a.length-1;
        while(i < j){
            if(a[i] + a[j] == target) break;
            else if(a[i] + a[j] > target) j--; 
            else if(a[i] + a[j] < target) i++;
        }
        return new int[] {i +1 ,j+1};
    }
}
