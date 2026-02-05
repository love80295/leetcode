class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxdiff = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0 ; i<nums.length-2 ; i++){
             int left = i+1;
             int right = nums.length-1;
             while(left<right){
                if(nums[i]+nums[left]+nums[right]==target){
                   return nums[i]+nums[left]+nums[right];
                }
                int diff = Math.abs((nums[i]+nums[left]+nums[right])-target);
                if(diff<maxdiff){
                    maxdiff = diff;
                    result = nums[i]+nums[left]+nums[right];
                    
                    
                }
                if(nums[i]+nums[left]+nums[right]<target) left++;
                else right--;

             }
        }
        return result;
    }
}