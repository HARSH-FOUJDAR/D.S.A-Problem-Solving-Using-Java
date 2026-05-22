import java.util.HashSet;
import java.util.Set;

public class findaduplicateelement {
    static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 1};
        System.out.print(Dupli(arr));
    }

    public static int Dupli(int[] arr) {
        Set<Integer> newans = new HashSet<>();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!newans.contains(arr[i])) {
                newans.add(arr[i]);
            } else {
                n = arr[i];
            }
        }
        return n;
    }
}
