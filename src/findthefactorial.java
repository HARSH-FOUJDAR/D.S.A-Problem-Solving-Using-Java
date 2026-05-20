public class findthefactorial {
    static void main(String[] args) {
        System.out.print(Fec(15));
    }

    public static int Fec(int n) {
        if (n == 1) {
            return 1;
        }
        return n *= Fec(n - 1);
    }
}
