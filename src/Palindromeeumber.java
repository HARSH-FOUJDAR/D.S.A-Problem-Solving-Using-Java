public class Palindromeeumber {
    static void main(String[] args) {
        int num = -121;
        System.out.println((validpailindrome(num)));
    }

    public static boolean validpailindrome(int num) {
        String arr = Integer.toString(num);
        String newarr = "";

        for (int i = arr.length() - 1; i >= 0; i--) {
            newarr += arr.charAt(i);
        }
        return arr.equals(newarr);

    }

}
