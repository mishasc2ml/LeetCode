class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String res = "";
        String digit = String.valueOf(x);
        for (int i = digit.length() - 1; i >= 0; i--) {
            res += digit.charAt(i);
        }
        return res.equals(digit);
    }
}