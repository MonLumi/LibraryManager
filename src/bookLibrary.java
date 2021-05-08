import java.util.ArrayList;
import java.util.List;

public class bookLibrary {
    //this class is what programme do and store books in ArrayList
    //I set library to private for secure

    private static List<Book> library = new ArrayList<>();

    public static void addBookToLibrary(String id, String title, String author, boolean isBorrowed) {
        Book newBook = new Book(id, title, author, isBorrowed);
        library.add(newBook);
    }

    public static List<Book> getLibrary(){
        return library;
    }
}
