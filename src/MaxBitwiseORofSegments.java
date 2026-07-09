public class MaxBitwiseORofSegments {
    static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        ans(arr);
    }

    public static void ans(int[] num) {
        int maxOr = 0;

        for (int i = 0; i <= num.length - 1; i++) {
            int currOr = 0;

            for (int j = num.length - 1; j >= 0; j--) {
                currOr = currOr | num[j];
                maxOr = Math.max(maxOr, currOr);
            }
        }
        System.out.println(maxOr);
    }
}
