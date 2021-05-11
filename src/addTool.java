import java.util.Scanner;

public class addTool {

    public static String id(){
        System.out.print("ID: ");
        return manager.input.nextLine();
    }

    public static String title(){
        System.out.print("Title: ");
        return manager.input.nextLine();
    }

    public static String author(){
        System.out.print("Author: ");
        return manager.input.nextLine();
    }

    public static boolean isBorrowed(){
        System.out.print("Is borrowed? (Type \"1\" for Yes): ");
        int choice = Integer.parseInt(manager.input.nextLine());
        return (choice == 1);
    }
}
