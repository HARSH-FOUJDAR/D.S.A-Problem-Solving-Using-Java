public class MaximumFind {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(MaximuNum(arr));
    }

    public static int MaximuNum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                
            }
        }
        return max;
    }
}
