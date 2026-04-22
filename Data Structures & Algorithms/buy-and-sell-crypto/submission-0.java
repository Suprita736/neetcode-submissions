class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0,prof = 0;
        min = Math.min(min, prices[0]);
        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = Math.min(prices[i], min);
            }
            else{
                diff = Math.max(diff,prices[i] - min);
                prof = Math.max(prof, diff);
            }
        }
        return prof;
    }
}
