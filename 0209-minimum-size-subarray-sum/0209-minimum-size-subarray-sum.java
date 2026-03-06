class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
           sum = sum + nums[i];
           if(sum<target) high++;
           else break;
        }
        if(sum<target) return 0;
       // high = high+1;
        int len = Integer.MAX_VALUE;
        
        while(high<nums.length){
            if(sum>=target){
                int len1 = (high-low)+1;
                
                len = Math.min(len,len1);
                sum = sum - nums[low];
                low++;
                
            }else{
                high++;
                if(high==nums.length) break;
                sum = sum + nums[high];
            }
        }
        return len;
    }
}