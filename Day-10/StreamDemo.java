
import java.util.*;
import java.util.stream.*;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 5, 20, 15, 30, 8, 25
        );

        // 1. Display all numbers
        System.out.println("All Numbers: " + numbers);

        // 2. Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 3. Filter numbers greater than 10
        List<Integer> greaterNumbers = numbers.stream()
            .filter(n -> n > 10)
            .collect(Collectors.toList());

        System.out.println("Greater than 10: " + greaterNumbers);

        // 4. Sort numbers
        List<Integer> sortedNumbers = numbers.stream()
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);

        // 5. Find sum
        int sum = numbers.stream()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("Sum: " + sum);

        // 6. Convert numbers into squares
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());

        System.out.println("Squares: " + squares);
    }
}
