package library;

public interface LibraryOperations {
    void addBook(Book book);
    void displayBooks();
    void searchBook(int id) throws LibraryException;
    void issueBook(int id) throws LibraryException;
    void returnBook(int id) throws LibraryException;
}