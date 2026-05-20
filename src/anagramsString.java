public class anagramsString {
    static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.print(AnagramCeck(str1, str2));
    }

    public static boolean AnagramCeck(String str1, String str2) {
        int i = 0;
        int j = str2.length() - 1;
        boolean found = false;
        if (str1.length() != str2.length()) {
            found = false;
        }
        while (j > i) {
            if (str1.charAt(i) != str2.charAt(j)) {
                found = false;
                break;
            } else {
                found = true;
            }


            i++;
            j--;
        }
        return found;
    }
}
