import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args){
        int newstr = 0;
        int num  = 121;
        int oroginal  = num;
        if(oroginal < 0){
            System.out.println(false);
        }
        while(num >0){
            int digits = num %10;
            newstr = newstr*10+digits;
            num = num/10;
        }
        System.out.println(newstr == oroginal  ? true : false);
    }
}
