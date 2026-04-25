import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static  void  main(String[] args){
        String str = "MCMXCIV";
        Map<Character ,Integer > newstr = new HashMap<>();
        newstr.put('I',1);
        newstr.put('V',5);
        newstr.put('X',10);
        newstr.put('L',50);
        newstr.put('C',100);
        newstr.put('D',500);
        newstr.put('M',1000);
        int sum =0;
        for (int i = 0; i <str.length()-1; i++) {
           int first = newstr.get(str.charAt(i));
           int second = newstr.get(str.charAt(i+1));

           if(first < second){
               sum -= first;
           }
           else {
               sum += first;
           }
        }
        sum += newstr.get(str.charAt(str.length()-1));
        System.out.println(sum);

    }
}
