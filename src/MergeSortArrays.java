import java.util.Arrays;

public class MergeSortArrays {
    static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        System.out.print(Arrays.toString(Mergesort(num1, m, num2, n)));

    }

    public static int[] Mergesort(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && arr1[i] >= arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        return arr1;
    }
}
