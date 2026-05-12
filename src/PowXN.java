public class PowXN {
    static void main(String[] args) {
        double a = 2.00000;
        int n = 10;
        System.out.printf("%.5f", maypow(a, n));
    }

    public static double maypow(double num, int n) {
        double ans = 1;
        boolean isnagetive = false;
        if (n < 0) {
            isnagetive = true;
            n = Math.abs(n);
        }
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) {
                ans = ans * num;
            } else {
                ans = 1 / ans;
            }
        }
        return ans;

    }
}
