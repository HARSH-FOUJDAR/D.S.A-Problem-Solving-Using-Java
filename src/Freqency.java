import java.util.HashMap;
import java.util.Map;

public class Freqency {
    static void main(String[] args) {
        String str = "tree";
        Map<Character, Integer> frequencycount = new HashMap<>();
        for (char num : str.toCharArray()) {
            frequencycount.put(num, frequencycount.getOrDefault(num, 0) + 1);
        }

        int maxcount = 0;
        String ans = "";
        for (Map.Entry<Character, Integer> entry : frequencycount.entrySet()) {
            if (entry.getValue() >= maxcount) {
                ans += entry.getKey();
            }
        }
        System.out.print(ans);
    }
}
