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
        lineBreak();
        System.out.println("1. Enter a new book");
        System.out.println("2. Search a book");
        System.out.println("3. Display books");
        System.out.println("4. Borrow a book");
        System.out.println("5. Exit");
        lineBreak();
    }

    public static int userChoice(){
        System.out.print("Your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println();
        return choice;
    }

    public static void repeater(int choice){
        do {
            switch (choice) {
                case 1 -> {
                    String isRepeat;
                    do {
                        bookList.add();
                        System.out.print("Do you want to add another Book? (\"1\" for Yes): ");
                        isRepeat = input.nextLine();
                        System.out.println();
                    } while (isRepeat.equals("1"));


                    System.out.println("Back to Welcome Screen!");
                    System.out.println();
                }
                case 2 -> {
                    String isRepeat;
                    do {
                        bookList.search();
                        System.out.print("Do you want to search another Book? (\"1\" for Yes): ");
                        isRepeat = input.nextLine();
                        System.out.println();
                    } while (isRepeat.equals("1"));

                    System.out.println("Back to Welcome Screen!");
                    System.out.println();
                }
                case 3 -> bookList.display();
                case 4 -> {
                    String isRepeat;
                    do {
                        bookList.borrow();
                        System.out.print("Do you want to borrow another Book? (\"1\" for Yes): ");
                        isRepeat = input.nextLine();
                        System.out.println();
                    } while (isRepeat.equals("1"));

                    System.out.println("Back to Welcome Screen!");
                    System.out.println();
                }
                //case 5 for first input, other times will jump to while statement and exit
                case 5 -> System.out.println("--------------------");
                default -> System.out.println("Your input isn't correct, please try again!");
            }
            if (choice < 5) {
                welcomeScreen();
                choice = userChoice();
            }

        } while (choice!=5);
    }

    public static void exit(){
        System.out.println("Thank! See you later.");

    }
    
    public static void lineBreak(){
        System.out.println("--------------------");
    }
}
