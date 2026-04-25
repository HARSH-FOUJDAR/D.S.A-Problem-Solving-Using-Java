import java.util.Arrays;
import java.util.Scanner;

public class DeleteLastKArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i <N; i++) {
            arr[i] = sc.nextInt();
        }
        if(N==K){
           return;
        }

        if(N  > K ){
        for (int i = 0;  i < arr.length-K; i++) {
            System.out.print(arr[i] + " ");
        }
        }else if(N <K ){
           return;
        }

    }
}
