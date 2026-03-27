class Solution {
    public List<List<String>> solveNQueens(int n) {
     char[][] board = new char[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board , 0 , ans);
        return ans;
    }
      private void queen(char[][] board , int row , List<List<String>> ans ){
        int n = board.length;
        if(row==n){
            ArrayList<String> l = new ArrayList<>();
            for(int i = 0 ; i<n ; i++){
                String s = "";
                for(int j = 0 ; j<n ; j++){
                    s+=board[i][j];
                }
                l.add(s);
            }
            ans.add(l);
            return;
            
        }
        for(int j = 0 ; j<n ; j++ ){
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                queen(board , row+1 , ans);
                board[row][j] = '.'; // bactracking

        }
    }
}
private boolean isSafe(char[][]board , int row , int col){
        // check row
    int n = board.length;
    for(int j = 0 ; j<n ; j++){
        if(board[row][j]=='Q') return false;
    }
    // check col
    for(int i = 0 ; i<n ; i++){
        if(board[i][col]=='Q') return false;
    }
    // check 1st diagonal
    int i = row;
    int j = col;
    while(i>=0 && j<n){
        if(board[i][j]=='Q') return false;
        i--;
        j++;
    }
    // check 2nd diagonal;
    i = row;
    j = col;
    while(i>=0 && j>=0){
        if(board[i][j]=='Q') return false;
        i--;
        j--;
    }
    // check 3rd diagonal;
    i = row;
    j = col;
    while(i<n && j<n){
        if(board[i][j]=='Q') return false;
        i++;
        j++;
    }
    // check 4th diagonal;
    i = row;
    j = col;
    while(i>n && j>=0){
        if(board[i][j]=='Q') return false;
        i++;
        j--;
    }
    return true;
}
}