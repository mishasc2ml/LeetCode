class Solution {
    public int sumOfMultiples(int n) {

        return checkDiversity(n);
    }
    
    private int checkDiversity(int n) {
        if (n < 3) {
            return 0;
        }
        
        if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return n + checkDiversity(n - 1);
        } else {
            return checkDiversity(n - 1);
        }
    }
}