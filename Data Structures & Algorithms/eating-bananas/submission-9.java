class Solution {
    public int minEatingSpeed(int[] piles, int h){
        Arrays.sort(piles);
        if(piles.length == h) return piles[piles.length-1];
         int k = 0,i=1,j=piles[piles.length-1];
         long hours = 0;
        while(i <= j){
            int mid = (i+j)/2;
            for(int l=0;l<piles.length;l++){
                hours += Math.ceil((double)piles[l]/mid);
            }
            if(hours <= h){
                j = mid-1;
                k = mid;
            }
            else{
                i = mid+1;
            }
            hours = 0;
        }
        return k;
    }
}
