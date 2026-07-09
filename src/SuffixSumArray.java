import java.util.Scanner;

public class SuffixSumArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        suffix(arr);
    }

    public static void suffix(int[] arr) {
        int n = arr.length;
        int[] newans = new int[n];
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            num += arr[i];
            newans[i] = num;
        }

        for (int result : newans) {
            System.out.print(result + " ");
        }

    }
}
