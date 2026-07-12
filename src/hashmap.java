import java.util.HashMap;

public class hashmap {
    static void main(String[] arg) {
        HashMap<Integer, String> map = new HashMap();

        map.put(1, "Harsh");
        map.put(2, "Nisha");
        map.put(3, "Suman");
        map.put(4, "Indu");

        System.out.println(map.containsKey(2));
        System.out.println(map.get(1));


    }
}
