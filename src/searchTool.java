import java.util.ArrayList;
import java.util.List;

public class searchTool {

    static List<Book> library = bookLibrary.getLibrary();
    static List <Book> searchResults = new ArrayList<>();

    public static void clearOldSearch(){
        searchResults.clear();
    }
    public static void id() {
        System.out.print("Type Book's ID: ");
        String id = manager.input.nextLine();

        for (Book book : library) {
            if (id.equals(book.getId())) searchResults.add(book);
        }
        if (searchResults.size() > 1) System.out.println("Sorry for programme's limit, there are duplicate Book's ID!");
    }

    public static void tilte(){
        System.out.print("Type Book's Title: ");
        String title = manager.input.nextLine();

        for (Book book : library) {
            if (title.equals(book.getTitle())) searchResults.add(book);
        }
    }

    public static void author(){
        System.out.print("Type Book's Author: ");
        String author = manager.input.nextLine();

        for (Book book : library){
            if (author.equals(book.getAuthor())) searchResults.add(book);
        }
    }

    public static void notBorrow(){
        for (Book book : library) {
            if (!book.getIsBorrowed()) searchResults.add(book);
        }
    }

    public static void showResult() {
        int size = searchResults.size();
        printBlockDivide.print();
        if (size == 0) {
            System.out.println("No Book's founded!");
            return;
        } else if (size == 1) {
            System.out.println("Book's founded");
        } else {
            System.out.println("We found " + size + " Books: ");

        }
        System.out.printf("%-10s%-20s%-20s%-20s%n", "ID", "TITLE", "AUTHOR", "STATUS");
        for (Book book : searchResults) {
            System.out.println(book.toString());
        }
        printBlockDivide.print();

    }

    public static void menu(){
        System.out.println("Choice what do you want to search:");
        printBlockDivide.print();
        System.out.println("1. Search by Book's ID");
        System.out.println("2. Search by Book's Title");
        System.out.println("3. Search by Book's Author");
        System.out.println("4. Search which Books are available");
        System.out.println("5. Go Back");
        printBlockDivide.print();
        System.out.print("Your choice: ");
    }
}
