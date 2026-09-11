class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length<=1) return false;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)){
                return true;
            }
            
        }
        return false;
    }
}