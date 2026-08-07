import java.util.HashMap;

public class Majority {
    static void main(String[] args) {
        int[] arr = {1, 2};
        MajorityElement(arr);

    }

    public static void MajorityElement(int[] arr) {
        HashMap<Integer, Integer> newans = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (newans.containsKey(arr[i])) {
                newans.put(arr[i], newans.get(arr[i]) + 1);
            } else {
                newans.put(arr[i], 1);
            }
        }

        for (int num : newans.keySet()) {
            if (newans.get(num) > n / 3) {
                System.out.println(num);
            }
        }
    }
}
