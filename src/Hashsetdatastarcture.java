import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdatastarcture {
    static void main(String[] args) {
        HashSet<Integer> newdata = new HashSet<>();
        newdata.add(1);
        newdata.add(2);
        newdata.add(3);
        newdata.add(4);
        newdata.add(5);

        Iterator iterator = newdata.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
     
    }
}
