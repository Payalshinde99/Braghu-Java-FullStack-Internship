
abstract class Shape {
    public abstract double calculateArea();

    public void displayMessage() {
        System.out.println("Calculating shape area...");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayMessage();
        System.out.printf("Circle area: %.2f%n",
                circle.calculateArea());

        rectangle.displayMessage();
        System.out.printf("Rectangle area: %.2f%n",
                rectangle.calculateArea());
    }
}
