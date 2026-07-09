import java.util.Arrays;

public class FindtheDuplicateNumber {
    static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(finddupli(arr));
    }

    public static int findDupli(int[] arr) {
        Arrays.sort(arr);
        int left = arr[0];
        int right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            if (arr[left] != arr[right]) {
                left++;
                right--;
            } else if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
            ans = arr[left];
        }
        return ans;
    }

    //Optmization pproach
    public static int finddupli(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int mid = right - (right + left) / 2;
        int ans = 0;
        while (left < right && mid > 0) {
            if (arr[mid] == arr[left]) {
                ans = arr[mid];
                right = mid - 1;
            } else if (arr[right] == arr[mid]) {
                ans = arr[mid];
            }

        }
        return ans;
    }


}
