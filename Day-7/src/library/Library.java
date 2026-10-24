package library;

import java.util.ArrayList;

public class Library implements LibraryOperations {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Error: Book ID already exists.");
                return;
            }
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    private Book findBook(int id) throws LibraryException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        throw new LibraryException("Book not found!");
    }

    @Override
    public void searchBook(int id) throws LibraryException {
        Book book = findBook(id);
        book.displayBook();
    }

    @Override
    public void issueBook(int id) throws LibraryException {
        Book book = findBook(id);

        if (!book.isAvailable()) {
            throw new LibraryException("Book is already issued!");
        }

        book.setAvailable(false);
        System.out.println("Book issued successfully!");
    }

    @Override
    public void returnBook(int id) throws LibraryException {
        Book book = findBook(id);

        if (book.isAvailable()) {
            throw new LibraryException("Book has not been issued!");
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully!");
    }
}