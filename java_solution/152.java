class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = 0;
        int continueProduct = 1;
        int i;
        for(i=0; i<nums.length; i++){
            if(i == 0){
                maxProduct = nums[i];
                continueProduct = nums[i]; 
            }else{
                if(continueProduct == 0){
                    continueProduct = nums[i];
                }else{
                    continueProduct *= nums[i];
                }
                if(continueProduct > maxProduct){
                    maxProduct = continueProduct;
                } 
            }
        }
        continueProduct = 1;
        for(i=nums.length-1; i>=0; i--){
            if(i == nums.length-1){
                continueProduct = nums[i]; 

            }else{                
                if(continueProduct == 0){
                    continueProduct = nums[i];
                }else{
                    continueProduct *= nums[i];
                }                             
            }
            if(continueProduct > maxProduct){
                maxProduct = continueProduct;
            }
        }
        return maxProduct;
    }
}