class Solution {
    public int[] dailyTemperatures(int[] te) {
        int[] a = new int[te.length];
        int j = 0;
        for(int i=0;i<te.length;i++){
            j = i + 1;
            while(j < te.length){
              if(te[i] >= te[j]){
                j++;
              }
              else{
                a[i] = j-i;
                break;
              }
            }
            if(j >= te.length) a[i] = 0;
        }
        return a;
    }
}
