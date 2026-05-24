public class BackTrakiks {
    static void main(String[] args) {
        String str = "ABC";
        Premutation(str, "", 0);
    }


    public static void Premutation(String str, String prem, int idex) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            Premutation(newstr, prem + currChar, idex + 1);
        }
    }
}
