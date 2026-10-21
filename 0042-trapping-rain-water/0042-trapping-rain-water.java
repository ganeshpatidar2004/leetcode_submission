class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right=n-1, leftmax=0, total=0, rightmax  = 0;

        while(left < right){
            if(height[left] <= height[right]){
                leftmax = Math.max(leftmax, height[left]);
                total += leftmax - height[left];
                
                left++;
            }else{
                if(rightmax < height[right]){
                    rightmax = height[right];
                }else{
                    total += rightmax - height[right];
                }
                right--;
            }
        }
      return total;  
    }
}