class Solution {
    public int minEatingSpeed(int[] p, int h) {
        Arrays.sort(p);
        if(h == p.length) return p[p.length-1];
        int sum = 0,k = 0,max = 0,st = 1,end = p[p.length-1],ok = 0;
        while(st <= end){
            k = (st + end)/2;
            for(int i=0;i<p.length;i++){
            sum += (int)Math.ceil((double)p[i]/k);
        }
        if(sum <= h){
            ok = k;
            end = k-1;
        }
        else if(sum > h){
            st = k + 1;
          }
          sum = 0;
        }
        return ok;
    }
}






































