public class ExcelSheetColumnTitle {
    static void main(String[] args) {
        int n = 28;
        System.out.println(convertToTitle(n));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            int remember = columnNumber % 26;
            char character = (char) ('A' + remember);
            str.append(character);

            columnNumber /= 26;

        }
        return str.reverse().toString();
    }

}
