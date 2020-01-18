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
        int num = x, rem = 0;
        long rev =0;
        while( x > 0){
            rem = x%10;
            rev = rev * 10 + rem;
            x /=10; 
        }
        return num == rev;
    }
}