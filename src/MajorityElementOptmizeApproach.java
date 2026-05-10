import java.util.Arrays;

public class MajorityElementOptmizeApproach {
    static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.print(Arrays.toString(OptmizeElement(arr)));
    }

    // Sorting algo
    public static int[] OptmizeElement(int[] arr) {
        //firstly sort the arr;
        Arrays.sort(arr);
        return arr;
    }
}
