public class ContainerWithMostWaterBruteForceApproach {
    static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.print(result(arr));
    }
//
//    //Brute Force Approach
//    public static int result(int[] height) {
//        int maxwater = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int w = j - i;
//                int h = Math.min(height[i], height[j]);
//                int area = w * h;
//                maxwater = Math.max(maxwater, area);
//            }
//        }
//        return maxwater;

    //Optimal Approach
    public static int result(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxwater = 0;

        while (left < right) {

            int height = right - left;
            int width = Math.min(arr[left], arr[right]);
            int area = height * width;
            maxwater = Math.max(maxwater, area);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }
}
