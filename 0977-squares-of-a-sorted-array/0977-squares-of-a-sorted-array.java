class Solution {
    public int[] sortedSquares(int[] nums) {
         int count = 0;
         for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]<0) count++;
         }
         int[]arr1 = new int[count];
         int[]arr2 = new int[nums.length-count];
         int[]arr = new int[nums.length];
         int i1 = 0 , i2=0;
         for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]<0){
                arr1[i1] = nums[i];
                i1++;
            }else{
                arr2[i2] = nums[i];
                i2++;
            }
         }
         int start = 0;
         int end = arr1.length-1;
         while(start<=end){
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
         }
         int i = 0;
         int j = 0;
         int k = 0;
         while(i<arr1.length && j<arr2.length){
            if(arr1[i]*arr1[i]<arr2[j]*arr2[j]){
                arr[k] = arr1[i]*arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j]*arr2[j];
                j++;
                k++;
            }
         }
         while(i<arr1.length){
            arr[k] = arr1[i]*arr1[i];
            k++;
            i++;
         }
         while(j<arr2.length){
            arr[k] = arr2[j]*arr2[j];
            k++;
            j++;
         }
         return arr;

    }
}