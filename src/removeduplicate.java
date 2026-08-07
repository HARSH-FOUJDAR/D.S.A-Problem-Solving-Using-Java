import java.util.HashSet;

public class removeduplicate {
    static void main(String[] args) {
        String string = "pwwkew";
        System.out.println(Sustring(string));
    }

    public static int Sustring(String s) {

        HashSet<Character> myset = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!myset.contains(s.charAt(right))) {
                myset.add(s.charAt(right));
                right++;
                max = Math.max(max, myset.size());
            } else {
                myset.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
