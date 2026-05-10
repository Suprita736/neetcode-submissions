class Solution {
    public int maxArea(int[] h) {
        int i = 0,j = h.length-1,max = Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(Math.min(h[i],h[j]) * (j-i),max);
            if(h[i] <= h[j]) i++;
            else j--;
        }
        return max;
    }
}
