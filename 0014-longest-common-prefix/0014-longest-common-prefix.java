class Solution {
    public String longestCommonPrefix(String[] strs) {
        int currentPos = 0;
        StringBuilder sb = new StringBuilder();
        while (currentPos < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (currentPos >= strs[i].length()) {
                    return sb.toString();
                }
                if (strs[0].charAt(currentPos) != strs[i].charAt(currentPos)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(currentPos));
            currentPos++;
        }
        return sb.toString();
    }
}