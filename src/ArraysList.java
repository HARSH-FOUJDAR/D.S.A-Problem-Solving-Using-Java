import java.util.ArrayList;

public class ArraysList {
    static void main(String[] main) {
        ArrayList<Integer> newans = new ArrayList<>();

        //add the Number
        newans.add(10);
        newans.add(20);
        newans.add(30);
        newans.add(40);
        newans.add(50);

        newans.add(0, 14);

//        System.out.print(newans);

        //Delet element

        newans.remove(1);
        System.out.print(newans);

    }
}
