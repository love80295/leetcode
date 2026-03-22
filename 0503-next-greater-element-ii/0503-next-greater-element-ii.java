class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int[]ans = new int[nums.length];
     Stack<Integer> st = new Stack<>();
     for(int i = nums.length-2 ; i>=0 ; i--){
        st.push(i);
     }

        for(int i = nums.length-1 ; i>=0 ; i--){
           while(st.size()>0 && nums[st.peek()]<=nums[i]){
            st.pop();
           }
           if(st.size()==0) ans[i] = -1;
           else ans[i] = nums[st.peek()];
           st.push(i);
        }
        return ans;    
    }
}