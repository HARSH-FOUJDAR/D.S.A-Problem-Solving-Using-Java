import java.util.Scanner;
public class SelectionSort {
    public  static void main(){

        int[] arr = {8, 7, 3, 2 ,1 };

        //Selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
         for(int j= i+1 ; j<arr.length; j++){
         if(arr[smallest] > arr[j]){
          smallest = j;
          }
        }
         int temp = arr[smallest];
         arr[smallest] = arr[i];
         arr[i] = temp;
        }
      for (int num : arr){
          System.out.print(num + " ");
      }
    }
}
