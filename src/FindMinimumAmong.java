import java.util.Scanner;

public class FindMinimumAmong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];


        for(int  i=0;  i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int num : arr) {
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);

    }
}
