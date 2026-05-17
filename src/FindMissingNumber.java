public class FindMissingNumber {
    static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int total = (n * (n + 1)) / 2;
        System.out.print(total - sum);
    }
}
