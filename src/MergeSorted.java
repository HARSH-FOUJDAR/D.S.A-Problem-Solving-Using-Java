public class MergeSorted {
    public static  void  main(String[] args){
     int[]  nums1 = {1};
     int[]  nums2  ={};

     int m  = 1;
     int n  = 0;

     int i  = m-1;
     int j =  n-1;
     int k  = m + n -1;
     while( j>=0){
         if(i >=0  && nums1[i] > nums2[j]){
             nums1[k] = nums1[i];
             i--;
         }
         else {
             nums1[k]  = nums2[j];
             j--;
         }
         k--;
     }
     for(int ans : nums1){
         System.out.print(ans + " ");
     }
    }
}
