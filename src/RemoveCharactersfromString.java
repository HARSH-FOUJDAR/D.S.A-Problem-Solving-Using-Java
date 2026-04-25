import java.util.Scanner;

public class RemoveCharactersfromString {
    public  static void main(String[] argst){
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

         String result ="";
        for (int i = 0; i <s1.length(); i++) {
        char ch = s1.charAt(i);
        if(!s2.contains(String.valueOf(ch))){
            result+= ch;
            }
        }
        System.out.println(result.length() > 0 ?  result : -1);

    }
}
