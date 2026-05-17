import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSuum {
    static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.print(fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> newans = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; ) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        newans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;
            }
        }
        return newans;
    }
}
