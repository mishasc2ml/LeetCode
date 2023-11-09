class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int last = x % 10;
            x /= 10;
            reversed = reversed * 10 + last;
        }
        
        
        return x == reversed || x == reversed / 10; 
    }
}