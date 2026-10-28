import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Sorted numbers: " + numbers);

        System.out.println("Smallest: " + numbers.first());
        System.out.println("Largest: " + numbers.last());

        numbers.remove(40);

        System.out.println("After removing: " + numbers);
    }
}