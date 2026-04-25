public class MergeAndSortArr {
    public static  void main(String[] args) {


           String result = "";
            int n  = 5;
            int m  = 4;
            int[] nums1  = {1 ,2 ,3, 4 ,5};
            int[] nums2 = {1, 2 ,3 ,4};
            int i=n-1;
            int j= m-1;

            while( j >=0){
                if(i>=0  && nums1[i] >= nums2[j]){
                    result += nums1[i];
                    i--;
                }else {
                    result += nums1[j];
                    j--;
                }

            }

      String ans = new StringBuilder(result).reverse().toString();
        System.out.println(ans + "  ");

        }

}
