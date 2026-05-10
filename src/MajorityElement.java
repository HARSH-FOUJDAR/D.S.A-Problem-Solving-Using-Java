import java.util.HashMap;
import java.util.Map;

class MajorityElement {
    static void main(String[] args) {
        int[] nums = {3, 2, 2, 2, 2, 3};
        System.out.print(Element(nums));
    }

    public static int Element(int[] arr) {
        // Firstly Count the Freq
        int maxKey = 0;
        int maxVal = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> maping : map.entrySet()) {
            if (maping.getValue() > maxVal) {
                maxVal = maping.getValue();
                maxKey = maping.getKey();

            }
        }

        return maxKey;
    }
}
