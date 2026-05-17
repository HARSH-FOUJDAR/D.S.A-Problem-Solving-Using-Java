import java.util.LinkedList;
import java.util.Queue;

public class StackLinearDataStracture {
    static void main(String[] args) {
        Queue<Integer> newstack = new LinkedList<>();
        newstack.add(2);
        newstack.add(3);
        newstack.add(4);
        newstack.add(5);

        System.out.print(newstack.remove());
    }
}
