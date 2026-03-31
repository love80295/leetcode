class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i<board.length ; i++){
            for(int j  = 0 ; j<board[0].length ;j++){
                if(board[i][j]==word.charAt(0)){
                    if(isMatch(board , i , j , word , 0)==true) return true; 
                }
            }
        }
        return false;
    }
    static boolean isMatch(char[][]board , int row , int col , String s , int idx){
        if(idx==s.length()){
            return true;
        }
       if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != s.charAt(idx)) return false; 
        char ch = board[row][col];
        board[row][col] = '#';
        boolean ans = isMatch(board , row , col+1 , s , idx+1) ||
                      isMatch(board , row , col-1 , s , idx+1) ||
                      isMatch(board , row-1 , col , s , idx+1) ||
                      isMatch(board , row+1 , col , s , idx+1); 
     board[row][col] = ch;
    return ans;                  
    }
}