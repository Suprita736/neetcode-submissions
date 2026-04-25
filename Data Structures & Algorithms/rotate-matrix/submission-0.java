class Solution {
    public void rotate(int[][] m) {
        int j = 0;
        while(j < m.length){
            for(int i=j;i<m.length;i++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
            j++;
        }

        j=0;
        int k = m.length - 1;
        while(j < k){
            for(int i=0;i<m.length;i++){
                int temp = m[i][j];
                m[i][j] = m[i][k];
                m[i][k] = temp; 
            }
            j++;
            k--;
        }
    }
}
