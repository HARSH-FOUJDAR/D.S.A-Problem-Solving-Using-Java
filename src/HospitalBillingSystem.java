import java.util.Scanner;
public class HospitalBillingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int D = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();

        System.out.print((R*D) + (C +M));

    }
}
