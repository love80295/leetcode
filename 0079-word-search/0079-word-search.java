class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i = 0 ; i<board.length ; i++){
        for(int j = 0 ; j<board[0].length ; j++){
            if(board[i][j]==word.charAt(0)){
                if(isValid(board , i , j , 0 , word )) return true;
            }
        }
       }
       return false;
    }
    public boolean isValid(char[][] board , int row ,  int col , int idx , String word){
        if(idx==word.length()){
            return true;
        }
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx)) return false; 
           
       char ch = board[row][col];
       board[row][col] = '#';
       boolean ans = isValid(board , row , col+1 , idx+1 , word ) ||
                    isValid(board , row , col-1 , idx+1 , word ) ||
                    isValid(board , row+1 , col , idx+1 , word ) ||
                    isValid(board , row-1 , col , idx+1 , word ); 
    board[row][col] = ch;
    return ans;
    }
}