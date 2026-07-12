public class DivideTwoIntegers {
    static void main(String[] args) {
        int a = 7;
        int b = -3;
        System.out.print(divisona(a, b));
    }

    public static int divisona(int dividend, int divisor) {

        int count = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }

        return count;
    }
}
