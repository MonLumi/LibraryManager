import java.util.Scanner;

public class bookList {
    // this class for shown what user need to do

    static Scanner input = new Scanner(System.in);

    public static void addNewBook() {
        System.out.println("Enter information for the new book:");
        System.out.println("---------------------");

        String id = addTool.id();
        String title = addTool.title();
        String author = addTool.author();
        boolean isBorrowed = addTool.isBorrowed();

        bookLibrary.addBookToLibrary(id, title, author, isBorrowed);
        System.out.println("A new book has been successfully added");

        System.out.print("Do you want to add another Book? (\"1\" for Yes): ");
        if (input.nextInt() == 1) addNewBook();
    }

    public static void search() {
        searchTool.menu();

        int choice = input.nextInt();
        if (choice == 5) System.out.println();
        else if (choice == 0 || choice > 5) {
            System.out.println("Your input isn't correct, please try again!");
            System.out.println();
            search();
        } else {
            switch (choice) {
                case 1 -> searchTool.id();
                case 2 -> searchTool.tilte();
                case 3 -> searchTool.author();
                case 4 -> searchTool.notBorrow();
            }
            searchTool.showResult();

            System.out.print("Do you want to search another Book? (\"1\" for Yes): ");
            if (input.nextInt() == 1) search();
            else {
                System.out.println();
            }
        }
    }

    public static void display() {

    }

    public static void borrow() {

    }
}
