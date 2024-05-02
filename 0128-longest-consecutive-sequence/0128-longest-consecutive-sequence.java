class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxSeq = 0;
        int curMax = 1;
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains((nums[i]) - 1)) {
                curMax = 1;
                int x = nums[i];
                while (set.contains(x + 1)) {
                    curMax++;
                    x += 1;
                }
                maxSeq = Math.max(maxSeq, curMax);
            }   
        }
        return maxSeq;
    }
}