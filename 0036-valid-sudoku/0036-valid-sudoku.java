class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j]=='.') continue;
                char ch = board[i][j];
                board[i][j]='.';
                if(isValid(board , i , j , ch)==false) return false;
                board[i][j] = ch;
            }
        }
        return true;
    }
    static boolean isValid(char[][]board , int row , int col , char num){
        // chack row
        for(int j = 0 ; j<9 ; j++){
            if(board[row][j]==num) return false;
        }
        // checkk column
        for(int i = 0 ; i<9 ; i++){
            if(board[i][col]==num) return false;
        }
        // checkk grid
        int sr = row/3*3;
        int sc = col/3*3;
        for(int i = sr ; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}