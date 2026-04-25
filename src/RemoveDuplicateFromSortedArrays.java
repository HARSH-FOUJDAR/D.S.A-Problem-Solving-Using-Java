import java.util.Map;
import java.util.Stack;
public class RemoveDuplicateFromSortedArrays {
    public static void main(String[] args){
        //Two pointer Approach
        int[] arr  = {1,1,2};
       Stack<Integer> result = new Stack<>();
       result.push(arr[0]);
       for(int i=1; i<arr.length; i++){
       if(arr[i]!=result.peek()){

       }
     }
    System.out.print(result);
    }
}





