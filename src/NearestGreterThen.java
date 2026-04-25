import java.util.Arrays;
import java.util.Scanner;
public class NearestGreterThen {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
             while(num > 0){
                if(num%10==0){
                    System.out.println(num);
                    break;
                }
                num++;
            }
    }
}

