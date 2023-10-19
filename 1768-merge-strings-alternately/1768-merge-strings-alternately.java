class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = word1.length();
        
        String sum = word1 + word2;
        int pos = 0;
        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < sum.length()) {
            sb.append(sum.charAt(i++)).append(sum.charAt(j++));
            pos += 1;
        }
        if (pos < word1.length()) {
            sb.append(word1.substring(pos));
        } else if (pos < word2.length()) {
            sb.append(word2.substring(pos));
        }
        return sb.toString();
    }
}