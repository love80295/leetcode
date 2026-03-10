class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character , Integer> map = new HashMap<>();
        // int left = 0;
        // // int right = 0;
        // int maxlen = 0;
        // for(int i = 0 ; i<s.length() ; i++){
        //     char ch = s.charAt(i);
        //     if(!map.containsKey(ch)){
        //         map.put(ch , i);
        //     }else{
        //         int val = map.get(ch);
        //         // if(left>val) continue;
        //         // left = val+1;
        //         left = Math.max(left , val+1);
        //         map.put(ch , i);
        //     }
        //      int len = (i-left)+1;
        //      maxlen = Math.max(len , maxlen);

        // }
        // return maxlen;
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right<s.length() ; right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch , right);
            }else{
                int val = map.get(ch);
                left = Math.max(left , val+1);
                map.put(ch , right);
            }
            int len = (right-left)+1;
            maxlen = Math.max(len , maxlen);
        }
        return maxlen;
    }
}
