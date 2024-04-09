class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len = word1.length() > word2.length() ? word2.length() : word1.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        
        if (word1.length() == len) {
            sb.append(word2.substring(len));
        } else {
            sb.append(word1.substring(len));
        }
        return sb.toString();
    }
}