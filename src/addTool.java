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
        System.out.print("Is borrowed? (Type \"1\" for Yes): ");
        int choice = input.nextInt();
        return (choice == 1);
    }
}
