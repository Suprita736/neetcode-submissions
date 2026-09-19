class Solution {
    public boolean possible(int capacity,int days,int[] w){
        int i = 0,j = i+1,count = 0,sum = 0;
        sum = w[i];
        while(j < w.length){
            if(sum + w[j] <= capacity){
                sum += w[j++];
                if(j >= w.length) count++;
            }
            else{
                i = j;
                j = j + 1;
                count++;
                sum = w[i];
                if(j >= w.length) count++;
            }
        }
        if(count <= days) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0,max = Integer.MIN_VALUE;
        for(int k = 0;k < weights.length;k++){
            sum += weights[k];
            if(weights[k] > max) max = weights[k];
        }
        int i = max,j = sum,ans = 0;
        while(i <= j){
            int mid = (i + j) /2;
            boolean isPossible = possible(mid, days, weights);
            if(isPossible == true) {
                ans = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        i = 0;
        j = i + 1;
        max = Integer.MIN_VALUE;
        sum = weights[i];
        while(j < weights.length){
            if(sum + weights[j] <= ans){
                sum += weights[j++];
                if(j >= weights.length && sum > max){
                    max = sum;
                } 
            }
            else{
                i = j;
                j = j + 1;
                if(sum > max) max = sum;
                sum = weights[i];
                if(j >= weights.length && sum > max){
                    max = sum;
                } 
            }
        }
        return max;
    }
}