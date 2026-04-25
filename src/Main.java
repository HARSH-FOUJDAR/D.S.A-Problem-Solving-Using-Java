import java.util.Scanner;

class Main {
   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String haystack = "a";
        String needle = "a";
         int ans = -1;
        for(int i=0; i<=haystack.length() - needle.length(); i++){
            boolean found = true;
            for(int j=0; j<needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found){
                ans = i;
                break;
            }


        }

       System.out.println(ans);
    }
}