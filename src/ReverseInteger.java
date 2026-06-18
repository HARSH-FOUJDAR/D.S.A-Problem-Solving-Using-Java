public class ReverseInteger {
    static void main(String[] args) {
        int num = 1534236469;
        System.out.println(RevreseInterger(num));
    }

    public static int RevreseInterger(int num) {

        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans = (ans * 10) + digit;
            num = num / 10;

        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }
}
