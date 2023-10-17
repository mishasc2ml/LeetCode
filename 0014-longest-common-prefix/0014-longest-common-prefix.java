class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int j = 0;
        StringBuilder sb = new StringBuilder();
        
        while (j < strs[0].length()) {
            char current = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= j || strs[i].charAt(j) != current) {
                    return sb.toString();
                }
            }
            j++;
            sb.append(current);
        }
        return sb.toString();
    }
}