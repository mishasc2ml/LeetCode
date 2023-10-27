class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Deque<Character> qq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                qq.addLast(s.charAt(i));
            } else if (!qq.isEmpty() && ((qq.peekLast() == '{' && s.charAt(i) == '}') || (qq.peekLast() == '(' && s.charAt(i) == ')') ||
                                        (qq.peekLast() == '[' && s.charAt(i) == ']'))) {
                qq.removeLast();
            } else {
                return false;
            }   
        }
        return qq.isEmpty();
    }
}