import java.util.HashSet;

public class UnionArray {
    static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        System.out.println(Unionof2Arrays(arr1, arr2));
    }

    public static HashSet<Integer> Unionof2Arrays(int[] arr1, int[] arr2) {
        HashSet<Integer> newset = new HashSet<>();
        int i = 0;
        int j = 0;


        while (i < arr1.length - 1) {
            if (arr1[i] <= arr2[j]) {
                newset.add((arr1[i]));
                i++;

            } else {
                newset.add(arr2[j]);

            }
            j++;
        }
        return newset;
    }
}
