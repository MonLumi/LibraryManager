import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        welcomeScreen();
        int choice = 0;
        while (choice!=5) {
            choice = userChoice();
            switch (choice) {
                /*
                case 1 -> bookList.add();
                case 2 -> bookList.search();
                case 3 -> bookList.display();
                case 4 -> bookList.borrow();
                */
                default -> System.out.println("Your input isn't correct, please try again!");
            }
        }
        System.out.println("Thank! See you later.");
    }
    static Scanner input = new Scanner(System.in);

    public static void welcomeScreen() {
        System.out.println("Welcome to the online book library");
        System.out.println("--------------------");
        System.out.println("1. Enter a new book");
        System.out.println("2. Search a book by book title");
        System.out.println("3. Display books");
        System.out.println("4. Borrow a book by book id");
        System.out.println("5. Exit");
    }

    public static int userChoice(){
        System.out.print("Your choice: ");
        return input.nextByte();
    }

}
