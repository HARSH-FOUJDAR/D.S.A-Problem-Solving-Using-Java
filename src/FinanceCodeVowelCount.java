public class FinanceCodeVowelCount {
    static void main(String[] args) {
        String string = "Finance";
        System.out.println(vowelscount(string));


    }

    public static int vowelscount(String str) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
