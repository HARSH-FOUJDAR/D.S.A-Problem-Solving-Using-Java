public class Printtillnextzero {
    public static void printtill(int[] arr) {
        ///Find the First Zero
        int i = 0;
        int index = -1;
        int secondindex = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                index = i;
                break;
            }
            i++;
        }
        ///Find the zero if exit in the arr
        if (index == -1) {
            System.out.println("-1");
            return;
        }

        ///  Find the Num between the Two Arrays
        boolean foundSecondzero = false;

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                foundSecondzero = true;
                break;
            }
            System.out.println(arr[j] + " ");
        }
    }


    ///  Main Function

    static void main(String[] args) {
        int[] newans = {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        printtill(newans);
    }
}
