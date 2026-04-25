import java.util.Scanner;

public class ValidPailnDrom {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "A man, a plan, a canal: Panama".replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder newstr = new StringBuilder(str).reverse();
        int left = 0;
        int right = 0;


        boolean found = true;
        while (left < str.length() && right < newstr.length()){
            if(str.charAt(left) != newstr.charAt(right)){
                found = false;
                break;
            }
            left++;
            right++;
        }
        System.out.println(found ? true : false);

    }
}
