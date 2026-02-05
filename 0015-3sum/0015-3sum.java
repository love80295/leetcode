class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list1  = new ArrayList<>();
        for(int i = 0 ; i<nums.length-2 ; i++){
             if(i>0 && nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            int sum = -1* nums[i];
            while(left<right){
             ArrayList<Integer> list2 = new ArrayList<>();
            if(nums[left] + nums[right]==sum){
                list2.add(nums[i]);
                list2.add(nums[left]);
                list2.add(nums[right]);
                list1.add(list2);
                left++;
                right--;
                while(left<nums.length && (nums[left]==nums[left-1])){
                    left++;
                }
                while(left<right && (nums[right]==nums[right+1])){
                    right--;
                }
            }else if(nums[left] + nums[right] < sum){
                left++;
            }else{
                right--;
            }
         }
     }
        return list1;

    }
}