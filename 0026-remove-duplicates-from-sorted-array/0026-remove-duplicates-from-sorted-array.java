class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 1;
        int count = 1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
            }else{
                nums[k+1] = nums[j];
                k++;
                count++;
                j++;
            }
        }
        return count;
    }
}