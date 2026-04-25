import java.util.Scanner;
public class FectorialRecursion {
    public static void main(String[] args){
        System.out.print(Fect(5));
    }
    public static int Fect(int n){
        if(n==1){
            return 1;
        }
        return n*= Fect(n-1);
    }
}
