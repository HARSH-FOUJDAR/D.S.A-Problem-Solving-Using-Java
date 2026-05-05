import java.util.Scanner;
public class FindFecUsingRecrsion {
    public static void main(){
    Scanner sc = new Scanner (System.in);
    int n  =  sc.nextInt();
    System.out.print(fect(n));
    }
    public static int  fect(int n){
        if(n==0){
            return 1;
        }
        return n *= fect(n-1);
    }
}
