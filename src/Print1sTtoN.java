import java.util.Scanner;
public class Print1sTtoN {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        print(num);
    }
    public static void print(int n) {
        if (n > 5) {
            return;
        }
        System.out.print(n + " ");
         print(n+1);
    }
}
