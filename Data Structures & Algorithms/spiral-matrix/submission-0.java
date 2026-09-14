class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();
        int l = 0,r = matrix[0].length-1,u = 0,b = matrix.length-1;
        while(l <= r || u <= b){
            for(int i = l;i <= r && l <= r && u <= b;i++){
                li.add(matrix[u][i]);
            }
            u++;
            for(int j = u;j <= b && u <= b && l <= r;j++){
                li.add(matrix[j][r]);
            }
            r--;
            for(int k = r;k >= l && l <= r && u <= b;k--){
                li.add(matrix[b][k]);
            }
            b--;
            for(int m = b;m >= u && u <= b && l <= r;m--){
                li.add(matrix[m][l]);
            }
            l++;
        }
        return li;
    }
}
