import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        System.out.print(Duplicate(arr));
    }

    public static boolean Duplicate(int[] arr) {
        Set<Integer> newdata = new HashSet<>();

        for (int num : arr) {
            if (!newdata.contains(num)) {
                newdata.add(num);
            } else {
                return true;
            }

        }
        return false;

    }
}
