class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            // leftSum = leftSum + nums[i-1];
            // int rigSum = sum - leftSum - nums[i];

            // if(leftSum == rigSum)return i;
            if(i>0){
                leftSum += nums[i-1];
            }

            sum = sum-nums[i];
            if(sum == leftSum){
                return i;
            }
            
        }
        return -1;
    }
}