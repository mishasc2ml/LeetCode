class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        
        
        
        int res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                res -= values.get(s.charAt(i));
            } else {
                res += values.get(s.charAt(i));
            }
        }
        return res;
    }
}