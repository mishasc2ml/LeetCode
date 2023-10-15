class Solution {
    public int sumOfMultiples(int n) {

        return checkDivisibility(n);
    }
    
    private int checkDivisibility(int n) {
        if (n < 3) {
            return 0;
        }
        
        if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return n + checkDivisibility(n - 1);
        } else {
            return checkDivisibility(n - 1);
        }
    }
}