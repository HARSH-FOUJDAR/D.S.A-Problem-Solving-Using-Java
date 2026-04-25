import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LongestRepeatingSequence {
    public  static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int current = 1;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                current++;

                if (current > max) {
                    max = current;
                }

            }
            else if (arr[i] != arr[i + 1]) {
                current = 1;
            }
        }
        System.out.println(max > 0 ? max : -1);
    }
}



