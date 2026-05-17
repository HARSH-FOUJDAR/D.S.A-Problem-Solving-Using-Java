import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.print(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> newans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    newans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return newans;

    }
}
