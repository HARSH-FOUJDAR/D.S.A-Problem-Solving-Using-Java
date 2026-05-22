import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class JavaStreamApi {

    public int id;
    public String Employeename;
    public int Salery;


    JavaStreamApi(int id, String Employeename, int Salery) {
        this.id = id;
        this.Employeename = Employeename;
        this.Salery = Salery;
    }

    public int getSalery() {
        return Salery;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public int getid() {
        return id;
    }

    public String toString() {
        return id + " " + Employeename + " " + Salery;
    }
}

class Employee {
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



