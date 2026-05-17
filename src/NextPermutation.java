import java.util.Arrays;

public class NextPermutation {
    static void main(String[] args) {
        int[] arr = {1, 1, 5};
        Premutation(arr);
        System.out.print(Arrays.toString(arr));

    }

    public static void Premutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i > 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        for (int j = nums.length - 1; j > index; j--) {
            if (nums[j] > nums[index]) {
                swap(nums, j, index);
                break;
            }
        }
        reverse(nums, index + 1, index - 1);
    }

    //This is Fuction help to Swaping
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //This is Fuction use to Reverse the number
    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }
}
