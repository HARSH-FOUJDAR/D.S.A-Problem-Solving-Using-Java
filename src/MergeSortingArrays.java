import java.util.Arrays;

class MergeSortingArrays {
    static void main() {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.print(Arrays.toString(merge(arr1, m, arr2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //Two Pointer Approach

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        return nums1;
    }
}
