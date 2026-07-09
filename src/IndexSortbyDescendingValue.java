import java.util.Arrays;

public class IndexSortbyDescendingValue {
    static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 5, 4};
        newarr(n, arr);
    }

    public static void newarr(int n, int[] arr) {

        Integer[] newans = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newans[i] = i;
        }

        Arrays.sort(newans, (a, b) -> arr[b] - arr[a]);
        for (int result : newans) {
            System.out.print(result + " ");
        }
    }
}
