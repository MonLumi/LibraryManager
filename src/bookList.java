import java.util.Scanner;

public class bookList {
    // this class for shown what user need to do

    public static void add() {
        System.out.println("Enter information for the new book:");
        printBlockDivide.print();

        String id = addTool.id();
        String title = addTool.title();
        String author = addTool.author();
        boolean isBorrowed = addTool.isBorrowed();

        printBlockDivide.print();
        bookLibrary.addBookToLibrary(id, title, author, isBorrowed);
        System.out.println("A new book has been successfully added");
    }

    public static void search() {
        searchTool.clearOldSearch();
        searchTool.menu();

        int choice = manager.input.nextInt();
        System.out.println();
        if (choice == 5) System.out.println();
        else if (choice == 0 || choice > 5) {
            System.out.println("Your manager.input isn't correct, please try again!");
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
            if (manager.input.nextInt() == 1) {
                System.out.println();
                search();
            }
        }
    }

    public static void display() {
        System.out.printf("%-10s%-20s%-20s%-20s%n", "ID", "TITLE", "AUTHOR", "STATUS");
        for (Book book : bookLibrary.getLibrary()) {
            System.out.println(book.toString());
        }
        printBlockDivide.print();
        System.out.print("Press Enter to go back");
        manager.input.nextLine();
        System.out.println();
    }

    public static void borrow() {

    }
}
