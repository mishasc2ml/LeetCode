class Solution {
    public int singleNumber(int[] nums) {
        int slow = 0;
        boolean hasPair = false;
        
        
        while (slow < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[slow] == nums[i] && slow != i) {
                    slow++;
                    hasPair = true;
                    break;
                }
            }
            if (!hasPair) {
                return nums[slow];
            } else {
                hasPair = false;
            }
        } 
        return 0;
}
}