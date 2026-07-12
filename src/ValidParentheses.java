import java.util.Stack;

public class ValidParentheses {
    static void main(String[] args) {
        String str = "(]";
        System.out.print(parentheses(str));
    }

    public static boolean parentheses(String str) {
        Stack<Character> newstack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                newstack.push(str.charAt(i));
            } else {
                if (newstack.isEmpty())
                    return false;
                char ch = newstack.pop();
                if (str.charAt(i) == ')' && ch != '(')
                    return false;

                if (str.charAt(i) == '}' && ch != '{')
                    return false;

                if (str.charAt(i) == ']' && ch != '[')
                    return false;

            }
        }

        return true;
    }
}

