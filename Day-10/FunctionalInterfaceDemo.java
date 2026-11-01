
@FunctionalInterface
interface Greeting {

    void sayHello(String name);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Implementing interface using lambda
        Greeting message = name -> {
            System.out.println("Hello " + name);
            System.out.println("Welcome to Java Programming!");
        };

        message.sayHello("Payal");
    }
}
