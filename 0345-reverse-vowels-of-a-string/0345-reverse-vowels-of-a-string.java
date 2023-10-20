class Solution {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        String vowels = "aeiou";
        String[] strs = s.split("");
        while (start < end) {
            //System.out.println(start);
            //System.out.println(end);
            if (vowels.contains(strs[start].toLowerCase()) && vowels.contains(strs[end].toLowerCase())) {
                String tmp = strs[start];
                strs[start] = strs[end];
                strs[end] = tmp;
                start++;
                end--;
            } else if (!vowels.contains(strs[start].toLowerCase()) && vowels.contains(strs[end].toLowerCase())) {
                start++;
            } else if (vowels.contains(strs[start].toLowerCase()) && !vowels.contains(strs[end].toLowerCase())) {
                end--;
            } else if (!vowels.contains(strs[start].toLowerCase()) && !vowels.contains(strs[end].toLowerCase())) {
                start++;
                end--;
            }
        }
            return Arrays.stream(strs).collect(Collectors.joining(""));
    }
}