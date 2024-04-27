class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int current = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= current;
            current *= nums[i];
        }
        current = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= current;
            current *= nums[i];
        }
        return result;
    }
}