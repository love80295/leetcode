class Solution {
   static int check = 0;
    public void solveSudoku(char[][] board) {
        helper(board , 0 , 0);
        check = 0;
    }
    public void helper(char[][] board , int row , int col){
        if(row==9){
            check = 1;
            return;
        }
        if(board[row][col]!='.'){
            if(col!=8){
                helper(board , row , col+1);
            }else{
                helper(board , row+1 , 0);
            } 
        }else{ // . he
           for(char i = '1' ; i<='9' ; i++){
             if(isValid(board , row , col , i)){
                board [row][col] = i; 
                 if(col!=8) helper(board , row , col+1);
                 else helper(board , row+1 , 0);
                 if(check==1) return;
                 board[row][col] = '.';
             }
           }
        }
    }
     public boolean isValid(char[][]board , int row , int col , char num){
        // check row
        for(int j = 0 ; j<9 ; j++){
            if(board[row][j]==num) return false;
        }
        // check col
        for(int i = 0 ; i<9 ; i++){
            if(board[i][col]==num) return false;
        }
        // check matrix
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