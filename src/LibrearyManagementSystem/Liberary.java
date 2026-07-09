package LibrearyManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liberary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Title = sc.next();
        String Author = sc.next();
        int id = sc.nextInt();

        String Id = String.valueOf(id);
        List<String> newLibreary = new ArrayList<>();

//        System.out.println("Book Title");
        newLibreary.add(Title);

//        System.out.println("Book Author");
        newLibreary.add(Author);

//        System.out.println("Book Id");
        newLibreary.add(Id);

        for (String lang : newLibreary) {
            System.out.print(lang + " ");
        }
    }
}
