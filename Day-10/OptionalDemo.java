
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // Creating Optional with a value
        Optional<String> name = Optional.of("Payal");

        // Checking whether value is present
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // Creating an empty Optional
        Optional<String> emptyName = Optional.empty();

        // Providing default value
        System.out.println(
            "Default Name: " + emptyName.orElse("Guest")
        );

        // Using ifPresent()
        name.ifPresent(value ->
            System.out.println("Welcome " + value)
        );
    }
}
