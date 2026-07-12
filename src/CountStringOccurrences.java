public class CountStringOccurrences {
    static void main(String[] args) {
        String str = "I enjoy doing codekata";
        String s = "learn";


        int count = 0;
        int index = str.indexOf(s);

        while (index != -1) {
            count++;
            index = str.indexOf(s, index + 1);
        }
        System.out.print(count > 0 ? count : -1);
    }
}
