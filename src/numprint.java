import java.util.Arrays;

public class numprint {
    static void main(String[] args) {
        int n = 3;
        int m = 9;
        System.out.println(Arrays.toString(printrange(n, m)));
    }

    public static int[] printrange(int n, int m) {
        for (int i = n; i <= m; i++) {
            System.out.print(Arrays.toString(new int[]{i}) + " ");
        }
        return new int[]{};
    }
}
