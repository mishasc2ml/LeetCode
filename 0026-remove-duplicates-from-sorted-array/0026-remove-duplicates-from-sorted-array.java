class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        if (nums.length == 0) {
            k = 0;
            return k;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
                k++;
            }
        }
            return k;
    }
}