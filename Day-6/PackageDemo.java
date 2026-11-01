
import mypackage.Calculator;

public class PackageDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 20));
        System.out.println("Multiplication: " + calc.multiply(5, 4));
    }
}
