import java.util.Arrays;

public class RunnerUpScore {
    static void main(String[] args) {
        int[] arr = {4, 4, 4};
        System.out.print(score(arr));
    }

    public static int score(int[] arr) {
        int max = 0;
        int secondmax = 0;
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (secondmax > arr[i] && max > secondmax) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
}
