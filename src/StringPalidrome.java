public class StringPalidrome {
    static void main(String[] args) {
        //Check The String is Palindrom or not
        String str = "ssss";
        System.out.print(palindrome(str));

    }

    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

