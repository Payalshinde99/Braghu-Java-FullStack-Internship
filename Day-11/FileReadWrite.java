
import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {

        String fileName = "student.txt";

        // Writing into a file
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Student Name: Payal Shinde\n");
            writer.write("Course: Java Full Stack Development\n");
            writer.write("Internship Day: 11\n");

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Writing Error: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            System.out.println("\nReading File:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Reading Error: " + e.getMessage());
        }
    }
}
