import java.util.Stack;
public class ProductofArrayExceptSelf {
    public static void main(){
        int[] arr = {1,2,3,4};
        int n  = arr.length;
        int[] ans =  new int[n];
        int leftproduct  = 1;
        int rightproduct =1;
        //Left side product Firstly
        for(int i=0; i<arr.length; i++){
            ans[i] = leftproduct;
            leftproduct*= arr[i];
        }
for(int j=n-1; j>=0; j--){
    ans[j] *= rightproduct;
    rightproduct*= arr[j];
}

    }
}
