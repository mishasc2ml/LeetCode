class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        
        Arrays.sort(nums);
        
        int curMax = 1;
        int max = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) {
                curMax++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                if (curMax > max) {
                    max = curMax;
                    curMax = 1;
                }
                curMax = 1;
            }
        }
        if (curMax > max) {
            max = curMax;
        }
        return max;
    }
}