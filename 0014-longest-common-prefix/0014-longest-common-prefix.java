class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String firstWord = strs[0];
        int pos = 0;
        while (pos < firstWord.length()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() - 1 < pos) {
                    return res;
                }
                if (strs[i].charAt(pos) != firstWord.charAt(pos)) {
                    return res;
                }
            }
            res += firstWord.charAt(pos);
            pos++;
        }
        return res;
    }
}