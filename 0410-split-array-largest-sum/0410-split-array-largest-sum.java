class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        int left = max;
        int right = sum;

        while(left<right){
            int mid = left + (right-left)/2;

            if(split(nums, k, mid)){

                right = mid;
            }else{
                left = mid+1;
            }

            
        }

        // sum = 0;
        // max = Integer.MIN_VALUE;

        // for(int i=0; i<nums.length; i++){
        //     if(sum > right){
        //         sum = 0;
        //     }
        //     max = Math.max(sum, max);
        //     sum += nums[i];
        // }


        return right;
    }

    boolean split(int[] nums, int k, int mid){
        int p = 1;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            if(sum+nums[i] > mid){
                p++;
                sum = nums[i];
            }else{
                sum += nums[i];
            }
        }
        return p<=k;
    }
}