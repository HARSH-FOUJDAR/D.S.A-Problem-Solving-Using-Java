import java.util.*;

public class ThreeSumUsingHassing {
    static void main(String[] ars) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Set<Integer> newans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int target = -arr[i];
            Set<Integer> s = new HashSet<>();


            for (int j = i + 1; j < n; j++) {
                int third = target - arr[j];


                if (!s.contains(third)) {
                    List<Integer> nums = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(nums);
                    newans.addAll(nums);
                }
                s.add(arr[j]);
            }
        }
        System.out.print(newans);
    }
}
