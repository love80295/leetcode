class Solution {
    public boolean isPowerOfThree(int n) {
        return power(n , 0);
    }
    static boolean power(int n , int p){
      if(Math.pow(3,p)>n) return false;
      if(Math.pow(3,p)==n) return true;
      return power(n , p+1);
    }

}