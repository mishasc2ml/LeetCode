class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{' || stack.size() == 0) {
                stack.push(cur);
            } else if ((cur == ')' && stack.peek() == '(') || (cur == ']' && stack.peek() == '[') || (cur == '}' && stack.peek() == '{')){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}