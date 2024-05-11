class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String digit = String.valueOf(x);
        StringBuilder res = new StringBuilder();
        for (int i = digit.length() - 1; i >= 0; i--) {
            res.append(digit.charAt(i));
        }
        return res.toString().equals(digit);
    }
}