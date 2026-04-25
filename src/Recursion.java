import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        System.out.println("Your Output");
        System.out.println(fectorial(ans));


    }
    public static int fectorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * fectorial(n-1);
    }

}
