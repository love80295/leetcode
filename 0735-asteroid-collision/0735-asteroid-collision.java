class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer>st = new Stack<>();
     st.push(asteroids[0]);
     for(int i = 1 ; i<asteroids.length ; i++){
        int  k = asteroids[i];
        // colision
        if(k<0){
            int j = -1*k;
            while(st.size()>0 && st.peek()>0 && st.peek()<j){
                st.pop();
            }
            if(st.size()>0 && st.peek()>0){
                if(st.peek()==j) st.pop();
               
            }else{
                st.push(k);
            }
        }
        else st.push(k);
       // if(j>st.peek()) st.push(k); 

     }
     //int ans1 = new int[0];
     if(st.isEmpty()) return new int[0];
     int[]ans = new int[st.size()];
     for(int i = ans.length-1 ; i>=0 ; i--){
        int y = st.peek();
        ans[i] = y;
        st.pop();
     }
     return ans;  
    }
}