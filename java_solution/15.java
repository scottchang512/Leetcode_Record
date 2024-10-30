class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i;
        List<List<Integer>> result = new ArrayList<>();
        for(i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }else if(nums[i] <= 0){
                int left = i+1;
                int right = nums.length-1;
                while(left < right){
                    int total = nums[i]+nums[left]+nums[right];
                    if( total == 0){
                        List<Integer> unit = new ArrayList<>();
                        unit.add(nums[i]);
                        unit.add(nums[left]);
                        unit.add(nums[right]);
                        result.add(unit);  
                        int tmpleft = left+1;
                        while(nums[left] == nums[tmpleft] && tmpleft < right){
                            tmpleft++;
                        }
                        left = tmpleft;
                    }else if(total > 0){
                        right--;
                    }else{
                        left++;
                    }
                }
            }else{
                break;
            }
        }
        return result;    
    }


}