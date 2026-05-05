import java.util.Scanner;

class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int minsec = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                minsec = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < minsec) {
                minsec = arr[i];
            }

        }
        System.out.print(minsec);
    }
}