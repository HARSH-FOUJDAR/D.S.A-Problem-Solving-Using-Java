import java.util.Scanner;
public class PrintNumberUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }
    public static void printnum(int n){
        if(n ==0) {
            return;
        }
        printnum(n  -1);
        System.out.print(n + " ");
    }

}
