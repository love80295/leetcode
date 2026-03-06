class Solution {
    public boolean isAnagram(String s, String t) {
              if(s.length()!=t.length()) return false;
        HashMap<Character , Integer> mp1 = maps(s);
        HashMap<Character , Integer> mp2 = maps(t);
        return mp1.equals(mp2);
    }
      static HashMap<Character , Integer> maps(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                int freq = mp.get(ch);
                mp.put(ch , freq+1);
            }else{
                mp.put(ch , 1);
            }

        }
        return mp;
    }
}