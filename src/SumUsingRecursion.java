import java.util.Scanner;
public class SumUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        System.out.println(Sum(ans));
    }
      public static int Sum(int n){
        if(n ==0){
            return 0;
        }
        return n + Sum(n-1);
    }
}
