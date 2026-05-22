import java.util.HashSet;

public class longestsubstring {
    static void main(String[] args) {
        String str = "bbbbb";
        System.out.print(SubString(str));
    }

    //Using the sliding Window Approach
    public static int SubString(String str) {
        HashSet<Character> mySet = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < str.length()) {
            if (!mySet.contains(str.charAt(right))) {
                mySet.add(str.charAt(right));
                right++;
                max = Math.max(max, mySet.size());
            } else {
                mySet.remove(str.charAt(left));
                left++;
            }
        }

        return max;
    }
}
