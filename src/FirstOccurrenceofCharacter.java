import java.util.Scanner;

public class FirstOccurrenceofCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        System.out.println(findchar(str, a));
    }

    public static int findchar(String str, char a) {
        int ans = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }
}
