package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample member to demonstrate inheritance and abstraction
        Member member = new Member(101, "Payal");

        System.out.println("Welcome to Library Management System");
        member.displayDetails();

        int choice = 0;

        try {
            while (choice != 6) {
                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. Add Book");
                System.out.println("2. Display All Books");
                System.out.println("3. Search Book");
                System.out.println("4. Issue Book");
                System.out.println("5. Return Book");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                try {
                    choice = Integer.parseInt(sc.nextLine().trim());

                    switch (choice) {
                        case 1:
                            System.out.print("Enter book ID: ");
                            int id = Integer.parseInt(sc.nextLine().trim());

                            System.out.print("Enter book title: ");
                            String title = sc.nextLine();

                            System.out.print("Enter author name: ");
                            String author = sc.nextLine();

                            if (title.isBlank() || author.isBlank()) {
                                System.out.println(
                                    "Title and author cannot be empty."
                                );
                                break;
                            }

                            if (id <= 0) {
                                System.out.println(
                                    "Book ID must be positive."
                                );
                                break;
                            }

                            library.addBook(new Book(id, title, author));
                            break;

                        case 2:
                            library.displayBooks();
                            break;

                        case 3:
                            System.out.print("Enter book ID to search: ");
                            id = Integer.parseInt(sc.nextLine().trim());
                            library.searchBook(id);
                            break;

                        case 4:
                            System.out.print("Enter book ID to issue: ");
                            id = Integer.parseInt(sc.nextLine().trim());
                            library.issueBook(id);
                            break;

                        case 5:
                            System.out.print("Enter book ID to return: ");
                            id = Integer.parseInt(sc.nextLine().trim());
                            library.returnBook(id);
                            break;

                        case 6:
                            System.out.println("Thank you for using the library!");
                            break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                } catch (LibraryException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } finally {
            sc.close();
        }
    }
}