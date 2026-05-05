import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        sum(arr, target, 0, current, result);
        System.out.print(result);
    }

    public static void sum(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == arr.length) {
            return;
        }

        current.add(arr[index]);
//
        sum(arr, target - arr[index], index, current, result);
//
        current.remove(current.size() - 1);

        sum(arr, target, index + 1, current, result);

    }

}
