
class Solution {
    public String defangIPaddr(String address) {
           String s = "[.]";
           StringBuilder ans = new StringBuilder("");
           for(int i = 0 ; i<address.length() ; i++){
               char ch = address.charAt(i);
               if(ch!='.'){
                   ans.append(ch);
               }else{
                   ans.append(s);
               }
           }
        //    String ans2 = ans.toString();
           return ans.toString();
    }
}
