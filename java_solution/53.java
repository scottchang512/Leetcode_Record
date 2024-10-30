class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int diff = 0;
        int i;
        for(i=0; i<nums.length; i++){
            if(i == 0){
                maxSum = nums[0];
                diff += nums[0];
            }else{
                if(diff < 0){
                    diff = 0;
                }
                diff += nums[i];
                if(diff > maxSum){
                    maxSum = diff;
                }
            }
        }
        return maxSum;
    }
}