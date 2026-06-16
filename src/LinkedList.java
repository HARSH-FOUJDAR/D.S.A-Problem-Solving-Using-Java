import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class LinkedList {

    Node head;

    // Main method
    static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst("a");
        list.addFirst("is");

        list.addLast("list");
        list.addFirst("this");
        list.printList();
    }

    // Add node at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add node at last
    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print linked list
    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    static class Employee {
        static void main(String[] args) {
            List<JavaStreamApi> newList = Arrays.asList(
                    new JavaStreamApi(1, "Harsh", 5000),
                    new JavaStreamApi(2, "Harsh", 3000),
                    new JavaStreamApi(3, "KARrsh", 8000)
            );
            newList.stream()
                    .sorted(Comparator.comparing(JavaStreamApi::getSalery))
                    .forEach(System.out::println);

        }
    }

    // Node class
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}