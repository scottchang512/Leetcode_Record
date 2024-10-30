class Solution {
    public int findMin(int[] nums) {        
        int min = 0;
        if(nums.length == 1){
            min = nums[0];
        }else{
            int i = (nums.length-1)/2;
            int imax = nums.length-1;
            int imin = 0;
            boolean seek = true;
            while(seek){
                int fronti = (i-1 <=0) ? 0 : i-1;
                int afteri = (i+1 >= nums.length-1) ? nums.length-1 : i+1;
                if(nums[afteri] >= nums[i] && nums[fronti] >= nums[i]){
                    min = nums[i];
                    seek = false;    
                }else if(nums[imax] < nums[i]){
                    if(afteri == imax){
                        min = nums[afteri];
                        seek = false;
                    }
                    imin = i;
                    i = (imax+i)/2;
                    
                }else{
                    if(fronti == imin){
                        min = nums[fronti];
                        seek = false;
                    }
                    imax = i;
                    i = (imin+i)/2;
                }
            }
        }
        return min;
    }
}