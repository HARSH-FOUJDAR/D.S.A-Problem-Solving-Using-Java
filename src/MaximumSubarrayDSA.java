public class MaximumSubarrayDSA {
    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = arr[0];
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum > maxsum) {
                maxsum = currsum;
            }

            if (currsum < 0) {
                currsum = 0;
            }
        }
        System.out.print(maxsum);
    }
}
