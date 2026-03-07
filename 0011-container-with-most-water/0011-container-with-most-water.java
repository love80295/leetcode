class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = Integer.MIN_VALUE;
        while(left<right){
            if(height[right]<height[left]){
                int curr = height[right] * (right-left);
                area = Math.max(area , curr);
                 right--;
            }else if( height[left]<height[right]){
                int curr = height[left] * (right-left);
                area = Math.max(area , curr);
                left++;
            }else{
                int curr = height[left] * (right-left);
                area = Math.max(area , curr);
                left++;
                right--;
            }
        }
         
       return area;   
    }
}