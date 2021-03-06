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
        manager.lineBreak();
        if (size == 0) {
            System.out.println("No Book's founded!");
        } else{
            if (size == 1) {
                System.out.println("Book's founded");
            } else {
                System.out.println("We found " + size + " Books: ");

            }
            System.out.printf("%-10s%-10s%-20s%-20s%-20s%n","NO.", "ID", "TITLE", "AUTHOR", "STATUS");
            for (int i = 0; i < searchResults.size(); i++) {
                System.out.printf("%-10s", i+1);
                System.out.println(searchResults.get(i).toString());
            }
        }
    }

    public static void menu(){
        System.out.println("Choice what do you want to search:");
        manager.lineBreak();
        System.out.println("1. Search by Book's ID");
        System.out.println("2. Search by Book's Title");
        System.out.println("3. Search by Book's Author");
        System.out.println("4. Search which Books are available");
        manager.lineBreak();
        System.out.print("Your choice: ");
    }
}
