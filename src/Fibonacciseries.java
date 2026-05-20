public class Fibonacciseries {
    static void main(String[] args) {
        int n = 15;
        System.out.print(fibonachi(n));
    }

    public static int fibonachi(int n) {
        int left = 0;
        int right = 1;
        int i = 0;
        int sum = 0;
        while (n > i) {
            int next = left + right;
            sum = next;
            left = right;
            right = next;
            i++;
        }
        return sum;
    }
}
