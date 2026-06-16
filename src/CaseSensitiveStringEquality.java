import java.util.Scanner;

public class CaseSensitiveStringEquality {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(str(str1, str2));
    }

    public static String str(String str1, String str2) {
        if (str1.equals(str2)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
