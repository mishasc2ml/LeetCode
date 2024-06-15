class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = word1.length() > word2.length() ? word2.length() : word1.length();
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        
        if (word1.length() > word2.length()) {
            res.append(word1.substring(minLength));
        } else{
            res.append(word2.substring(minLength));
        }
        
        return res.toString();
    }
}