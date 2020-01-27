package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println("Shailu");
        String s = "]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean isValid = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch1 = stack.pop();
                if (ch != poppedItem(ch1)) {
                    isValid = false;
                    break;
                }
            }

        }

        return stack.isEmpty() && isValid;

    }

    private static char poppedItem(char ch1) {
        switch (ch1) {
        case '{':
            return '}';
        case '[':
            return ']';
        case '(':
            return ')';
        }
        return ')';
    }
}