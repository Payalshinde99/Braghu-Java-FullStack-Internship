
public class MethodsPractice {

    // 1. Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // 2. Method to check even or odd
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Method overloading: two integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // 4. Method overloading: three integers
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 5. Method to find the largest of two numbers
    static int largest(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 20));

        System.out.println("Is 8 even? " + isEven(8));

        System.out.println("Multiply two numbers: "
                + multiply(4, 5));

        System.out.println("Multiply three numbers: "
                + multiply(2, 3, 4));

        System.out.println("Largest number: "
                + largest(25, 40));
    }
}

