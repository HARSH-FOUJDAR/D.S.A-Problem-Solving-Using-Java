import java.util.HashMap;
import java.util.Map;

public class TwoSumLetcode {
    static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twosumoptimal(nums, target));
    }

    //BRUTE fORCE APPROACH

    public static int[] Twosum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int right = nums[j];
                if (left + right == target) {
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }
        return ans;
    }
    // OPTIMAL APPROACH

    /// Use a Hash Map to store visited numbers for O(1) lookups, reducing time complexity to linear.

    public static int[] twosumoptimal(int[] arr, int target) {
        Map<Integer, Integer> newans = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (newans.containsKey(complement)) {
                return new int[]{newans.get(complement), i};
            }

            newans.put(arr[i], i);
        }
        return new int[]{};
    }
}
