class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans = power(n , 0);
        return ans;
    }
     static boolean power(int n , int p){
        if(Math.pow(2,p)==n) return true;
        if(Math.pow(2,p)>n) return false;
        return power(n , p+1);
    }
}