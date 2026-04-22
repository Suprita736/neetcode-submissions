class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0,j = matrix[0].length-1;
        while(i < matrix.length && matrix[i][j] <= target){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) break;
            else if(matrix[i][j] < target) i++;
        }
        if(i < matrix.length){
            int st = 0;
        while(st <= j){
            int mid = (st + j)/2;
            if(matrix[i][mid] == target) return true;
            else if(matrix[i][mid] > target) j = mid-1;
            else if(matrix[i][mid] < target) st = mid +1;
        }
        }
        return false;
    }
}
