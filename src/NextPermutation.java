import java.util.Arrays;

public class NextPermutation {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.print(Arrays.toString(arr));

    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int j = n - 2; j > 0; j--) {
            if (nums[j] < nums[j + 1]) {
                index = j;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index + 1, index - 1);
    }
}
