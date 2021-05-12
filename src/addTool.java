public class addTool {

    public static String id(){
        System.out.print("ID: ");
        String id = manager.input.nextLine();
        boolean isDuplicate = false;
        for (Book book : bookLibrary.getLibrary()) {
            if (book.getId().equals(id)) {
                isDuplicate = true;
                id = id.concat("D");
            }
        }
        if (isDuplicate) System.out.println("There are duplicate ID(s), new Book's ID: " + id);
        return id;
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
