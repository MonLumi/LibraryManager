import java.util.Scanner;

public class manager {
    public static void main(String[] args) {
        welcomeScreen();
        int choice = userChoice();
        repeater(choice);
        exit();
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
        return input.nextInt();
    }

    public static void repeater(int choice){
        do {
            switch (choice) {
                case 1 -> {
                    bookList.addNewBook();
                    System.out.println("Back to Welcome Screen!");
                    System.out.println();
                }
                case 2 -> bookList.search();
                case 3 -> bookList.display();
                case 4 -> bookList.borrow();
                //case 5 for first input, other times will jump to while statement and exit
                case 5 -> exit();
                default ->
                    System.out.println("Your input isn't correct, please try again!");
            }
            if (choice < 5) welcomeScreen();
            choice = userChoice();
        } while (choice!=5);
    }

    public static void exit(){
        System.out.println("Thank! See you later.");
    }
}