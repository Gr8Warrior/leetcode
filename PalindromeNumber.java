package leetcode;

/**
{@link 'https://leetcode.com/problems/palindrome-number/'
 */

class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(-121);
        System.out.println("isPalindrome = " + isPalindrome);

    }

    /** 
     * @param number
     * @return isPalindrome
     */

    public static boolean isPalindrome(int x) {
        int num = x;
        boolean isPositive = (x >= 0) ? true : false;
        if(!isPositive){
            return false;
        }
        long rev = 0;
        while (true) {
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return false;
            } else if (isPositive && x <= 0) {
                isPositive = (rev == num) ? true : false;
                return isPositive;
            } else if (!isPositive && x >= 0) {
                isPositive = (rev == num) ? true : false;
                return isPositive;
            }
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
    }
}