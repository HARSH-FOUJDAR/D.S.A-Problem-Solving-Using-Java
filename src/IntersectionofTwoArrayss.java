import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrayss {
    static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> newans = new HashSet<>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        int index = 0;
        int i = 0;
        int j = 0;
        while (i <= num1.length - 1 && j <= num2.length - 1) {
            if (num1[i] == num2[j]) {
                newans.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int n = newans.toArray().length;
        int[] arr = new int[n];
        for (Integer num : newans) {
            arr[index++] = num;
        }
        return arr;
    }
}
