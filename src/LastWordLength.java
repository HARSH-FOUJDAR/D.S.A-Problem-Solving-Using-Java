import java.util.Arrays;

public class LastWordLength {
    public static void main(String[] args){

        String str = "   fly me   to   the moon  ";
        String[] p = str.split(" ");

        System.out.println(p[p.length-1].length());
    }

}

