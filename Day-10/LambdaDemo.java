
public class LambdaDemo {

    public static void main(String[] args) {

        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.calculate(10, 5));

        System.out.println("Subtraction: " + subtract.calculate(10, 5));

        System.out.println("Multiplication: " + multiply.calculate(10, 5));
    }

    interface Calculator {
        int calculate(int a, int b);
    }
}
