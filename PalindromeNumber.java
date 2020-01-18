package leetcode;

/**
 * {@link 'https://leetcode.com/problems/palindrome-number/'
 */

class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(12321);
        System.out.println("isPalindrome = " + isPalindrome);

    }

    /**
     * @param number
     * @return isPalindrome
     */

    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return revertedNumber == x || x == revertedNumber/10;
    }
}