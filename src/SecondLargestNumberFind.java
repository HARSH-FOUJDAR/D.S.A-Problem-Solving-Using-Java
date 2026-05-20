public class SecondLargestNumberFind {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.print(Max(arr));
    }

    public static int Max(int[] arr) {
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
}
