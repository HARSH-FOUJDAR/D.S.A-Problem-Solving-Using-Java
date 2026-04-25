import java.util.Collections;
import java.util.Stack;

public class PlusOne {
    public  static void main (String[] args){
       int[] arr = {1,2,3};
       Stack<Integer> newans = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i++) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            }
        }
        for (int num : arr){
           newans.push(num);
        }
        System.out.println(newans);
    }
}
