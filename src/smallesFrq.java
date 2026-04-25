import java.util.HashMap;
import java.util.Map;


public class smallesFrq {
    public static void main(String[] args){
     int[] arr = {1,1,2,2,3,4};
        Map<Integer, Integer>  freq =  new HashMap<>();

        for(int num : arr){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq.get(3));
    }
}


