class Solution {
    public int sumFourDivisors(int[] nums) {
        int tot = 0;
         for(int i=0; i<nums.length; i++){
            int count = 0;
            int sum = 0;
            for(int j = 1; j*j <= nums[i]; j++){
                if(nums[i] % j == 0 && j*j < nums[i]){
                    sum += j + nums[i]/j;
                    count += 2;
                }else if(nums[i] % j == 0 && j*j == nums[i]){
                    sum += j;
                    count++;
                }

            }
            if(count == 4){
                tot += sum;
            }
         }
        return tot;

    }
}