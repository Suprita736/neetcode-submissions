class Solution {
    public int trap(int[] h) {
        int i = 0,j = i + 1,k = 0,w = 0,max = Integer.MIN_VALUE,min = 0;
        while(j < h.length) {
            if(i == 0 && h[i] == 0) {
                while(i < h.length && h[i] == 0) i++;
                if(i >=h.length) return 0;
                j = i + 1;
            }
            if(h[j] >= h[i] && j - i == 1) {
                i = j;
                j = i+1;
            }
            else if(h[j] >= h[i] && j - i > 1) {
                min = Math.min(h[i], h[j]);
                min = min * (j - i - 1);
                i++;
                while(i < j) min -= h[i++];
                w += min;
                i = j;
                j = i + 1;
                max = Integer.MIN_VALUE;
                if(w < 0) w = 0;
            }
            else {
                if(h[j] >= max && j-i > 1){
                    max = h[j];
                    k = j;
                }
                if(j < h.length-1) j++;
                else {
                    if(max == Integer.MIN_VALUE || i == j-1) {
                        return w;
                    }
                    min = Math.min(h[i], h[k]);
                    min = min * (k - i - 1);
                    i++;
                    while(i < k) {
                        if(h[i] > h[k]){
                            min = min - (h[k]);
                            i++;
                        }
                        else min -= h[i++];
                    }
                    w += min;
                    i = k;
                    j = i + 1;
                    max = Integer.MIN_VALUE;
                    if(w < 0) w = 0;
                }
            }
        }
        if(w < 0) return 0;
        return w;
    }
}
