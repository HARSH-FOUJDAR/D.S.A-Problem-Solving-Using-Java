public class findfectorials {
    static void main(String[] args) {
        int n = 5;
        System.out.print(findfecto(n));

    }

    public static int findfecto(int n) {
        if (n < 1) {
            return 1;
        }

        return n * findfecto(n - 1);
    }
}
