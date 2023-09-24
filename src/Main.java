import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MakeupShoppingList makeupShoppingList = new MakeupShoppingList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    makeupShoppingList.printMakeupShoppingList();
                    break;
                case 2:
                    addMakeupItem();
                    break;
                case 3:
                    modifyMakeupShoppingList();
                    break;
                case 4:
                    removeMakeupShoppingItem();
                    break;
                case 5:
                    findMakeupItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of makeup items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item on the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item on the list");
        System.out.println("\t 6 - to quit the application");
    }

    public static void addMakeupItem() {
        System.out.println("Please enter the makeup item: ");
        makeupShoppingList.addMakeupItem(scanner.nextLine());
    }

    public static void modifyMakeupShoppingList() {
        System.out.println("Enter makeup item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement makeup item: ");
        String newMakeupItem = scanner.nextLine();
        makeupShoppingList.modifyMakeupShoppingList(itemNumber - 1, newMakeupItem);
    }

    public static void removeMakeupShoppingItem() {
        System.out.println("Enter makeup item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        makeupShoppingList.removeMakeupShoppingItem(itemNumber - 1);
    }

    public static void findMakeupItem() {
        System.out.println("Makeup item to search for: ");
        String searchItem = scanner.nextLine();

        if (makeupShoppingList.findMakeupItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in makeup shopping list.");
        } else {
            System.out.println(searchItem + " could not be found in your makeup shopping list :(");
        }
    }
}