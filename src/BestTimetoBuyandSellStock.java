public class BestTimetoBuyandSellStock {
    static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        int firstprice = arr[0];
        int profit = 0;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (firstprice > arr[i]) {
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

    static class ListNodeans {
        int val;
        ListNodeans next;

        ListNodeans() {
        }

        ListNodeans(int val) {
            this.val = val;
        }

        ListNodeans(int val, ListNodeans next) {
            this.val = val;
            this.next = next;
        }
    }
}
