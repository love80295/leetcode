class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0 ; i<s.length() ; i++){
            Character ch1 = s.charAt(i);
            Character ch2 = t.charAt(i);
            if(!map.containsKey(ch1)){
                map.put(ch1,ch2);
                if(set.contains(ch2)) return false;
                else set.add(ch2);
            }else{
                char ch3 = map.get(ch1);
                if(ch3!=ch2) return false;
                
            }
        } 
        return true;
    }
}