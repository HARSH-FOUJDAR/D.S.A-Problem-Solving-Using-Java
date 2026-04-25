import java.util.Scanner;
import java.util.*;
public class Romantoniteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total =0;
        for(int i=0; i<s.length()-1; i++){
            int curr = map.get(s.charAt(i));
            int nextval = map.get(s.charAt(i+1));

            if(curr > nextval){
                total-= curr;
            }
            else {
                total += curr;
            }
        }
        total += map.get(s.charAt(s.length()-1));
        System.out.print(total);
    }

}
