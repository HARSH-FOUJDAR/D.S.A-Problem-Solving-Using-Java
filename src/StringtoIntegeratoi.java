public class StringtoIntegeratoi {
    static void main(String[] args) {
        String string = "-42";
        System.out.println(myAtoi(string));
    }

    public static int myAtoi(String str) {
        String newstr = str.replaceAll("\\s+", "");

        int newnum = Integer.parseInt(newstr);

        int num = 0;
        while (newnum > 0) {
            if (newstr.startsWith("-") || newstr.startsWith("+")) {
                int digits = newnum % 10;
                num = num * digits + 10;
                newnum = newnum / 10;
            } else {
                num = 0;
            }
        }
        return num;
    }

//    public static int mathmethod(String s) {
//
//    }
}
