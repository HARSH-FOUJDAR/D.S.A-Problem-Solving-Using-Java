import java.util.Arrays;
import java.util.HashSet;


public class IntersectionofTwoArrays {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6};
        System.out.print(ans(arr1, arr2));
    }

    public static HashSet<Integer> ans(int[] arr1, int[] arr2) {
        HashSet<Integer> newans = new HashSet<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (arr1.length > i && arr2.length > j) {
            if (arr1[i] == arr2[j]) {
                newans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return newans;
    }
}
