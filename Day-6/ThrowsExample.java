
import java.io.IOException;

public class ThrowsExample {
    static void checkFile() throws IOException {
        throw new IOException("File could not be opened.");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
