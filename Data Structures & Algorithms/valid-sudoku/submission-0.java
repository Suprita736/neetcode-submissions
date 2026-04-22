class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] subBox = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                int val = ch - '1';
                if(board[i][j] != '.'){
                    if(row[i][val] || col[j][val] || subBox[(i/3)*3+(j/3)][val])
                      return false;
                    row[i][val] = true;
                    col[j][val] = true;
                    subBox[(i/3)*3+(j/3)][val] = true;
                }
            }
        }
        return true;
    }
}
