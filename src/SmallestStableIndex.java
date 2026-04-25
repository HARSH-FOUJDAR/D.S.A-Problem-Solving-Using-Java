public interface SmallestStableIndex {
    static void main(String[] args) {
        int[] arr = {1,7};
        int k = 2;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int min  = arr[i];
            for (int j = 0; j <=i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            for (int j = i; j <arr.length ; j++) {
                if(arr[j] < min){
                    min = arr[j];
                }
                   }
                if(max - min <= k) {
                    ans = i;
                    break;
            }
        }
        System.out.println(ans);
    }
}
