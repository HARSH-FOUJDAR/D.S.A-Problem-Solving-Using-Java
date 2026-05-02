import java.util.Arrays;
public class SecondSmallest {
    public static void main (){
        int arr[]  = {1,2,3,4,};
        int min  = arr[0];
        int secondmin  = arr[1];



        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                secondmin  = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < secondmin){
                secondmin = arr[i];
            }

        }
        System.out.print(secondmin);
    }


}
