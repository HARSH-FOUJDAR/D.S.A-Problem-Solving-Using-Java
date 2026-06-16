public class LongestPalindromicSubstring {
    static void main(String[] args) {
        String str1 = "babad";
        System.out.println(PalindromicSubstring(str1));
    }

    //Using the Two Pointer approach
    public static String PalindromicSubstring(String str) {
        int left = 0;
        int right = str.length() - 1;
        String substring = "";
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                substring = (str.charAt(left) + " " + str.charAt(right));
                left++;
                right--;
            } else if (str.charAt(left) != str.charAt(right)) {
                right--;
            } else {
                left++;
            }

        }
        return substring;
    }
}
