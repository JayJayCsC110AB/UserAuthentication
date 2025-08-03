import java.util.Arrays;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        boolean result = isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
    }
    public static boolean isValid(String s) {
        if(s == null || s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1) return false;
                char open = stack[top--];
                if (!isMatchingPair(open, c)) return false;
            }
        }
        return top == -1;
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}