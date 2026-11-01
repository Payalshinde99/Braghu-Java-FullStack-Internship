
import java.util.Arrays;

public class ArrayPrograms {

    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 40};

        // 1. Print array elements
        System.out.println("Original array: "
                + Arrays.toString(numbers));

        // 2. Find sum and average
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // 3. Find maximum and minimum
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // 4. Reverse an array
        System.out.print("Reverse: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 5. Sort an array
        Arrays.sort(numbers);
        System.out.println("Sorted: "
                + Arrays.toString(numbers));

        // 6. Search for an element
        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println("Found " + target + "? " + found);
    }
}
