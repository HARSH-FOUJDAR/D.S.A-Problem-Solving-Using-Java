import java.util.ArrayList;
import java.util.List;

public class SUMTWO {
    static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        System.out.print(TwoSum(arr, target));
    }

    public static List<Integer> TwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        List<Integer> newans = new ArrayList<>();

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                newans.add(left);
                newans.add(right);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return newans;

    }
}
