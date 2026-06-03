import java.util.Arrays;

class FindLargestofThreeNumbers {
    static void main() {
        int[] arr = {1, 3, 2, 4, 5, 6};
        Arrays.sort(arr);
        int ans = arr[2];
        System.out.print(ans);

    }
}
