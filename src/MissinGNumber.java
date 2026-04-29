import java.util.Stack;
public class MissinGNumber {
    public static void main(String[] args){
        int arr[]  = {9,6,4,2,3,5,7,0,1};
        int sum =0;
        int n  = arr.length;
        for(int i=0;  i<arr.length;i++){
            sum+= arr[i];
        }
        int ans = (n*(n+1))/2;
        int result = ans - sum;
        System.out.print(result);
    }

}
