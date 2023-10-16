class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        
        
        int j = 0;
        
        while (j < strs[0].length()) {
            char ch = strs[0].charAt(j);
            for (int i = 0; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                    return sb.toString();
                }
            }
            j++;
            sb.append(ch);
        }
        return sb.toString();
    }
}