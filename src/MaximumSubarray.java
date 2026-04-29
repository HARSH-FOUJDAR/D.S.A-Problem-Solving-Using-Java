public class MaximumSubarray {
    public static void main(String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum  = arr[0];
    for(int i=0; i<arr.length; i++){
        int currsum =0;
      for(int j=i; j<arr.length; j++){
          currsum += arr[j];
          if(currsum > maxsum){
              maxsum = currsum;
          }
    }
    }
      System.out.print(maxsum);
    }
}
