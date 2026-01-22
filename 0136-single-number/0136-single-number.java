import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sumAll = 0;
        int uniquesum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sumAll = sumAll+nums[i];
            if(set.add(nums[i])){
                uniquesum+=nums[i];
            }
        }
        return (2*(uniquesum)) - sumAll;
        

    }
}