import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparable example
class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Sort by marks in ascending order
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class StudentSortDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Payal", 85));
        students.add(new Student(102, "Rahul", 70));
        students.add(new Student(103, "Priya", 95));
        students.add(new Student(104, "Amit", 60));

        // Comparable sorting
        Collections.sort(students);

        System.out.println("Sorted by marks:");

        for (Student s : students) {
            System.out.println(s);
        }

        // Comparator sorting by name
        students.sort(
            Comparator.comparing(s -> s.name)
        );

        System.out.println("\nSorted by name:");

        for (Student s : students) {
            System.out.println(s);
        }

        // Comparator sorting by marks descending
        students.sort(
            Comparator.comparingInt(
                (Student s) -> s.marks
            ).reversed()
        );

        System.out.println("\nSorted by marks descending:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}