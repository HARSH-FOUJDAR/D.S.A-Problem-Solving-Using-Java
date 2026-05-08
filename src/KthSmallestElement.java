import java.util.Arrays;

public class KthSmallestElement {
    static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 4};
        int k = 5;
        int ans = 0;
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                ans = arr[k - 1];
                break;
            }
        }
        System.out.print(ans > 0 ? ans : -1);
    }
}
