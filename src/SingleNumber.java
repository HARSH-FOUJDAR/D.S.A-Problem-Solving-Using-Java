public class SingleNumber {
    static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.print(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }
}
