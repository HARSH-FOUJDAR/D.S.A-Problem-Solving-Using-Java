public class CharacterCountinString {
    static void main(String[] srgs) {
        String str = "codekata";
        char ch = 'a';
        System.out.println(countchar(str, ch));
    }

    public static int countchar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
