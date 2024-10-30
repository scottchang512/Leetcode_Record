class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int i;
        HashSet<Integer> zeroIndex = new HashSet<>();
        for(i=0; i<=nums.length/2; i++){
            if(i > nums.length-i-1){
                total *= 1;
            }else if(i == nums.length-i-1){
                if(nums[i] == 0){
                    zeroIndex.add(i);
                }else{
                    total *= nums[i];
                };
            }else{
                if(nums[i] == 0){
                    zeroIndex.add(i);
                }else{
                    total *= nums[i];
                }
                if(nums[nums.length-i-1] == 0){
                    zeroIndex.add(nums.length-i-1);
                }else{
                    total *= nums[nums.length-i-1];
                }
            }            
        }
        for(i=0; i<=nums.length/2; i++){
            if(i > nums.length-i-1){
                return nums;
            }else if(i == nums.length-i-1){
                if(zeroIndex.size() > 1){
                    nums[i] = 0;
                }else if(zeroIndex.size() == 1 && !zeroIndex.contains(i)){
                    nums[i] = 0;
                }else if(zeroIndex.size() == 1 && zeroIndex.contains(i)){
                    nums[i] = total;    
                }else if(zeroIndex.size() == 0){
                    nums[i] = total/nums[i];
                }
            }else{
                if(zeroIndex.size() > 1){
                    nums[i] = 0;
                    nums[nums.length-i-1] = 0;
                }else if(zeroIndex.size() == 1){
                    if(!zeroIndex.contains(i)){
                        nums[i] = 0;
                    }else{
                        nums[i] = total;
                    }
                    if(!zeroIndex.contains(nums.length-i-1)){
                        nums[nums.length-i-1] = 0;
                    }else{
                        nums[nums.length-i-1] = total;
                    }                    
                }else{
                    nums[i] = total/nums[i];
                    nums[nums.length-i-1] = total/nums[nums.length-i-1];
                }
            }            
        }
        return nums;
    }
}