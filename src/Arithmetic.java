import java.util.Scanner;

public class Arithmetic {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();

       int latsnum = A + (C-1) * B;
       int result = C * (A+latsnum)/2;
        System.out.println(result);
    }
}
