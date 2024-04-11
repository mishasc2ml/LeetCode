class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            while (k > 0 && ans.length() > 0 && ans.charAt(ans.length() - 1) > current) {
                ans.deleteCharAt(ans.length() - 1);
                k--;
            }
            ans.append(current);
        }

        
        while (k-- > 0 && ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
        }
        
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        
        return ans.isEmpty() ? "0" : ans.toString();
    }

}