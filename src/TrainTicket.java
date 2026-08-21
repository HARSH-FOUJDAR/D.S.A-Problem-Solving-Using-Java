import java.util.HashMap;

public class TrainTicket {
    static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");
        ticket.put("jaipur", "Mumbai");


        String start = getStart(ticket);
        while (ticket.containsKey(start)) {
            System.out.print(start + " -> ");
            start = ticket.get(start);
        }
        System.out.print(start);

        System.out.println(getStart(ticket));
    }

    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> reverse = new HashMap<>();

        for (String key : ticket.keySet()) {
            reverse.put(ticket.get(key), key);
        }

        for (String key : ticket.keySet()) {
            if (!reverse.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
}
