package leetcode;

/**
{@link 'https://leetcode.com/problems/reverse-integer/'
 */

class ReverseInteger {
    public static void main(String[] args) {
        int reversedNumber = reverse(-2147483648);
        System.out.println("Reversed Number = " + reversedNumber);

    }

    /** 
     * @param number
     * @return reversed number of number
     */

    public static int reverse(int x) {
        boolean isPositive = (x >= 0) ? true : false;
        long rev = 0;
        while (true) {
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            } else if (isPositive && x <= 0) {
                return (int) rev;
            } else if (!isPositive && x >= 0) {
                return (int) rev;
            }
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
    }
}