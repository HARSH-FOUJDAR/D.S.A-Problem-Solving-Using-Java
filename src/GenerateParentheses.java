import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static void main(String[] args) {
        int n = 3;
        System.out.println(validans(n));
    }

    public static List<String> validans(int n) {
        List<String> newans = new ArrayList<>();
        int num = n;
        int open = 0;
        int close = 0;
        int i = 0;
        int j = 0;
        while (num >= i) {
            if (open < num) {
                newans.add("(");
                open++;
            }
            i++;
        }
        while (num >= j) {
            if (close < num) {
                newans.add(")");
                close++;
            }
            j++;
        }
        return newans;
    }
}
