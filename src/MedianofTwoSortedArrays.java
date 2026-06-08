import java.util.ArrayList;
import java.util.Collections;

public class MedianofTwoSortedArrays {
    static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }


    public static ArrayList<Integer> sortarr(int[] arr1, int[] arr2) {
        ArrayList<Integer> newarr = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                newarr.add(arr1[i]);
                i--;
            } else {
                newarr.add(arr2[j]);
                j--;
            }
        }
        while (i >= 0) {
            newarr.add(arr1[i]);
            i--;
        }

        while (j >= 0) {
            newarr.add(arr2[j]);
            j--;
        }
        Collections.reverse(newarr);
        return newarr;
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        ArrayList<Integer> newarr = sortarr(num1, num2);
        int n = newarr.size();
        double ans = 0;
        if (n % 2 == 0) {
            int evenmiddle = n / 2;
            int prev = evenmiddle - 1;
            ans = (newarr.get(evenmiddle) + newarr.get(prev)) / 2.0;
        } else {
            int oddmiddle = n / 2;
            ans = (newarr.get(oddmiddle));
        }
        return ans;
    }
}
