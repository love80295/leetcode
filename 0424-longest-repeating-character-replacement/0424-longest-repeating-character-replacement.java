class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character , Integer> map = new HashMap<>();
        // int low = 0 , high = 0;
        // int maxfreq = 0;
        // int max = Integer.MIN_VALUE;
        // while(high<s.length()){
        //    char ch = s.charAt(high);
        //    map.put(ch , map.getOrDefault(ch , 0) +1);
        //    maxfreq = Math.max(maxfreq , map.get(ch));
        //    if(((high-low)+1) - maxfreq > k ){
        //      char leftChar = s.charAt(low);
        //         map.put(leftChar , map.get(leftChar) - 1);
        //     low++;
        //    }
        //    max = Math.max(max , (high-low)+1);
        //    high++;
        // }
        // if(max==Integer.MIN_VALUE) return 0;
        // return max;
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int maxfreq = 0;
        int maxlen = Integer.MIN_VALUE;
        while(high<s.length()){
            char ch = s.charAt(high);
            map.put(ch , map.getOrDefault(ch , 0) +1);
            maxfreq = Math.max(maxfreq , map.get(ch));
            if(((high-low)+1) - maxfreq > k ){
                char left = s.charAt(low);
                map.put(left , map.get(left)-1);
                low++;
            }
         maxlen = Math.max(maxlen , (high-low)+1);
         high++;
        }
        return maxlen;
    }
}