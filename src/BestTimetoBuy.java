public class BestTimetoBuy {
    static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        //output = 5
        int firstprice = arr[0];
        int profit = 0;
        int maxprofit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < firstprice) {
                firstprice = arr[i];
            } else if (arr[i] > firstprice) {
                profit = arr[i] - firstprice;

                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        System.out.print(maxprofit);
    }
}
