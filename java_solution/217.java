class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> integerMap = new HashMap<>();
        boolean isContains = false;
        for(int num: nums){
            if(integerMap.get(num) == null){
                integerMap.put(num, 1);
            }else{
                isContains = true;
                break;
            }
        }
        return isContains;
    }
}