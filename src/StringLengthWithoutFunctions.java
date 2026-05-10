import java.util.Scanner;

public class StringLengthWithoutFunctions {
    private static String[] args;

    static void main(String[] args) {
        StringLengthWithoutFunctions.args = args;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ", "_");
        System.out.print(str.length());
    }
}
