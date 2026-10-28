import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("SQL");
        skills.add("Java");

        System.out.println("Skills: " + skills);

        System.out.println("Contains Java: " + skills.contains("Java"));

        skills.remove("Python");

        System.out.println("After removing: " + skills);

        System.out.println("Total skills: " + skills.size());
    }
}