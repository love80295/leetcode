class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
           else if(ch!=st.peek()) st.push(ch);
            else{
                st.pop();
            }
        
        }
        String ans = "";
      while(!st.isEmpty()){
          ans = ans + st.peek();
          st.pop();
      }  
    String reverse = "";
    for(int i = ans.length()-1 ; i>=0 ; i--){
        reverse+=ans.charAt(i);
    }
    return reverse;
    }
}