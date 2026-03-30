class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans = new int[nums1.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums1.length ; i++){
            map.put(nums1[i] , i);
        }
        Stack<Integer> st = new Stack<>();
        int n = nums2.length-1;
        st.push(n);
        for(int i = nums2.length-1 ; i>=0 ; i--){
            while(st.size()>0 && nums2[st.peek()]<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
              if(map.containsKey(nums2[i])){
                    int k = map.get(nums2[i]);
                    ans[k] = -1;
                }
            }
            else{
                if(map.containsKey(nums2[i])){
                    int k = map.get(nums2[i]);
                    ans[k] = nums2[st.peek()];
                }
            }
            st.push(i);
        }
       // ans[nums1.length-1] = -1;
        return ans;
        
    }
}