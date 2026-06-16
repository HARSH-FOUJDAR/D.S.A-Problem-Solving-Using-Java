import java.util.Scanner;

public class GCDofTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 30;
        int num2 = 73;
        System.out.println(FindtheGcd(num2, num2));
    }

    public static int FindtheGcd(int a, int b) {
        while (a > b & b > a) {
            if (a > b) {
                b = a % b;
            } else {
                a = b & a;
            }
        }
        if (a == 0 || b == 0) {
            return -1;
        } else {
            return a;
        }
    }
}
