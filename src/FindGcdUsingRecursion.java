class FindGcdUsingRecursion {
    static void main(String[] args) {
        int a = 36;
        int b = 60;
        System.out.print(RecursionGcd(a, b));
    }

    public static int RecursionGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return RecursionGcd(b, a % b);
    }
}
