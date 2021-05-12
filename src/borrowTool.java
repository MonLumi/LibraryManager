import java.util.ArrayList;
import java.util.List;

public class borrowTool {

    static List<Book> availableBook = searchTool.searchResults;
    static List<Book> borrowedBook = new ArrayList<>();

    static int size;
    
    static void menu(){
        System.out.println("Choice what do you want to borrow:");
        manager.lineBreak();
        System.out.println("1. Borrow by Book's ID");
        System.out.println("2. Borrow by Book's Title");
        System.out.println("3. Borrow by Book's Author");
        System.out.println("4. Borrow which Books are available");
        manager.lineBreak();
        System.out.print("Your choice: ");
    }

    static int choseWhatBorrow(){
        System.out.print("Select Book by No.: ");
        return Integer.parseInt(manager.input.nextLine());
    }

    static void displayAvailableBook(){
        availableBook.removeIf(Book::getIsBorrowed);
        searchTool.showResult();
        size = availableBook.size();
        if (size > 0) {
            System.out.println();
            System.out.printf("%-10s%-20s%n","0", "For all Books");
            System.out.printf("%-10s%-20s%n", availableBook.size()+1, "For none");
        }
        manager.lineBreak();
    }

    static void borrowAction(int choice){
        if (choice == 0) {
            borrowedBook.addAll(availableBook);
            displayBorrowedBook();
        } else if (choice < size + 1){
            borrowedBook.add(availableBook.get(choice-1));
            displayBorrowedBook();
        }

        for (Book borrowedBook : borrowedBook){
            for (Book book : bookLibrary.getLibrary()) {
                if (borrowedBook == book) book.setBorrowed(true);
            }
        }
    }

    static void displayBorrowedBook(){
        System.out.println();
        System.out.println("You have successful borrowed " + borrowedBook.size() + " books");
        manager.lineBreak();
        System.out.printf("%-10s%-10s%-20s%-20s%n","NO.", "ID", "TITLE", "AUTHOR");
        for (int i = 0; i < borrowedBook.size(); i++) {
            System.out.printf("%-10s", i+1);
            System.out.printf("%-10s", borrowedBook.get(i).getId());
            System.out.printf("%-20s", borrowedBook.get(i).getTitle());
            System.out.printf("%-20s%n", borrowedBook.get(i).getAuthor());
        }
    }
}
