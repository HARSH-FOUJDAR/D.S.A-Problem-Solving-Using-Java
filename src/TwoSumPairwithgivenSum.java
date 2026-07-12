import java.util.Arrays;

public class TwoSumPairwithgivenSum {
    static void main(String[] args) {
        int[] arrr = {0, -1, 2, -3, 1};
        int target = 3;
        System.out.println(TwoSum(arrr, target));
    }

    public static boolean TwoSum(int[] arr, int target) {
        Arrays.sort(arr);
        boolean found = false;
        //Using the two pointer approah
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return found;
    }
}
