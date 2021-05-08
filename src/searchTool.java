import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchTool {

    static List<Book> library = bookLibrary.getLibrary();
    static List <Book> searchResults = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void id() {
        System.out.print("Type Book's ID: ");
        String id = input.nextLine();

        for (Book book : library) {
            if (id.equals(book.getId())) searchResults.add(book);
        }
        if (searchResults.size() > 1) System.out.println("Sorry for programme's limit, there are duplicate Book's ID!");
    }

    public static void tilte(){
        System.out.print("Type Book's Title: ");
        String title = input.nextLine();

        for (Book book : library) {
            if (title.equals(book.getTitle())) searchResults.add(book);
        }
    }

    public static void author(){
        System.out.print("Type Book's Author: ");
        String author = input.nextLine();

        for (Book book : library){
            if (author.equals(book.getAuthor())) searchResults.add(book);
        }
    }

    public static void notBorrow(){
        for (Book book : library) {
            if (!book.getIsBorrowed()) searchResults.add(book);
        }
    }

    public static void showSearchResult() {
        int results = searchResults.size();
        if (results == 0) {
            System.out.println("No Book's founded");
        } else if (results == 1) {
            System.out.println("Book's founded");
            System.out.println(searchResults.toString());
        } else {
            System.out.println("There are duplicated Books, sorry for programme's limit: ");
            for (Book book : searchResults) {
                System.out.println(book.toString());
            }
        }
    }
}
