import java.util.Scanner;

public class addTool {
    static Scanner input = new Scanner(System.in);
    public static String id(){
        System.out.print("ID: ");
        return input.nextLine().toUpperCase();
    }

    public static String title(){
        System.out.print("Title: ");
        return input.nextLine();
    }

    public static String author(){
        System.out.print("Author: ");
        return input.nextLine();
    }

    public static boolean isBorrowed(){
        boolean isBorrowed;
        System.out.println("Status (Is borrowed or not)");
        System.out.print("y = yes, n = no): ");
        char choice = input.nextLine().toLowerCase().charAt(0);
        while (choice != 'y' && choice != 'n') {
            System.out.println("Your input is not valid! Please try \"y\" for Yes or \"n\" for No!");
            choice = input.nextLine().toLowerCase().charAt(0);
        }
        isBorrowed = (choice == 'y');
        return isBorrowed;
    }

}
