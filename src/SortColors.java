import java.util.Arrays;

public class SortColors {
    static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
//        System.out.println(Arrays.toString(sortColors(arr)));
        System.out.print(Arrays.toString(thirdApproach(arr)));
    }

//    public static int[] sortColors(int[] nums) {
//        //Brute Force
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        return nums;
//    }

    //Second Approach
//    public static void secondApproah(int[] arr) {
//
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) count1++;
//            else if (arr[i] == 1) count2++;
//            else {
//                count3++;
//            }
//
//
//        }
//        int index = 0;
//        for (int i = 0; i < count1; i++) {
//            arr[index++] = 0;
//        }
//        for (int i = 0; i < count2; i++) {
//            arr[index++] = 1;
//        }
//        for (int i = 0; i < count3; i++) {
//            arr[index++] = 2;
//        }
//
//    }
//Doutch National Flag Algorithm
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
            else {
                int temp = arr[heigh];
                arr[heigh] = arr[mid];
                arr[mid] = temp;
                heigh--;
            }
        }
        return arr;
    }
}
