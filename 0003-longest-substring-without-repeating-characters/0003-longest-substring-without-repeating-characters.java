class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int len = 0;
        for(int i = 0 ; i<s.length() ; i++){
              char ch = s.charAt(i);
              while(list.contains(ch)){
                list.remove(0);
              }
              list.add(ch);
              len = Math.max(len , list.size());
        }
        return len;
    }
}
