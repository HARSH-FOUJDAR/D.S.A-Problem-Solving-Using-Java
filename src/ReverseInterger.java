public class ReverseInterger {
    static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }

    public static int reverse(int num) {
        int ans = 0;

        while (num != 0) {
            int digits = num % 10;
            ans = ans * 10 + digits;
            num = num / 10;
        }
        return ans;
    }
}
