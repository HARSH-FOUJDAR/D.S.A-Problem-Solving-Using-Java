public class PowerofaNumber {
    static void main(String[] args) {
        int n = 121;
        int k = 11;
        power(n, k);
    }

    public static void power(int n, int k) {
        int ans = n / k;
        if (ans / k == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


