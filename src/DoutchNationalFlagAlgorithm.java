import java.util.Arrays;

public class DoutchNationalFlagAlgorithm {
    static void main() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.print(Arrays.toString(thirdApproach(arr)));
    }

    public static int[] thirdApproach(int[] arr) {
        int low = 0;
        int mid = 0;
        int heigh = arr.length - 1;

        while (mid <= heigh) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }
//            num 2
            else if (arr[mid] == 2) {
                
                int temp = arr[heigh];
                arr[heigh] = arr[mid];
                arr[mid] = temp;
                heigh--;
            }
        }
        return arr;
    }
}
