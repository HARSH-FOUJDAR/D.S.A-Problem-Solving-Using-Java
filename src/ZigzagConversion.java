import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int row = 3;
        System.out.println(ZigZeg(str, row));
    }

    public static String ZigZeg(String str, int numrow) {
        if (numrow == 1) {
            return str;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(str.length(), numrow); i++) {
            rows.add(new StringBuilder());
        }

        int i = 0;
        boolean goingDown = false;


        for (char s : str.toCharArray()) {
            rows.get(i).append(s);
            if (i == 0 || i == numrow - 1)
                goingDown = !goingDown;
            i += goingDown ? 1 : -1;

        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder ans : rows) {
            result.append(ans);
        }
        return result.toString();
    }

}
