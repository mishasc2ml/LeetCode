class Solution {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] chars = s.toCharArray();
        while (start < end) {
            if (vowels.contains(chars[start]) && vowels.contains(chars[end])) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                start++;
                end--;
            } else if (!vowels.contains(chars[start]) && vowels.contains(chars[end])) {
                start++;
            } else if (vowels.contains(chars[start]) && !vowels.contains(chars[end])) {
                end--;
            } else if (!vowels.contains(chars[start]) && !vowels.contains(chars[end])) {
                start++;
                end--;
            }
        }
            return new String(chars);
    }
}