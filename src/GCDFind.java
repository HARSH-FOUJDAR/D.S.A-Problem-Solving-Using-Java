public class GCDFind {
    static void main(String[] args) {
        int a = 36;
        int b = 60;
        System.out.print(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        //wer can us tegh kadance algorithm
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a;
    }
}
