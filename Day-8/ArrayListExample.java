
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Payal");
        students.add("Shivani");
        students.add("Madhuri");
        students.add("Payal");

        System.out.println("Students: " + students);

        students.remove("Shivani");

        System.out.println("After removing: " + students);

        System.out.println("First student: " + students.get(0));

        System.out.println("Total students: " + students.size());
    }
}