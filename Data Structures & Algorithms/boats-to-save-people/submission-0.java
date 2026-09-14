class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int i = 0,j = p.length-1,count = 0;
        while(i <= j){
            if(i == j){
                count++;
                i++;
                j--;
            }
            else if(p[j] == limit || p[i] + p[j] > limit){
                count++;
                j--;
            }
            else if(p[i] + p[j] <= limit){
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}