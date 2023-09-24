import java.util.ArrayList;

public class MakeupShoppingList {
    private ArrayList<String> makeupShoppingList = new ArrayList<>();

    public void addMakeupItem(String item) {
        makeupShoppingList.add(item);
    }

    public void printMakeupShoppingList() {
        System.out.println("You have " + makeupShoppingList + " items on your list.");

        for (int i = 0; i < makeupShoppingList.size(); i++) {
            System.out.println((i+1) + ". " + makeupShoppingList.get(i));
        }
    }

    public void modifyMakeupShoppingList (int position, String newItem) {
        makeupShoppingList.set(position, newItem);
        System.out.println("Makeup item " + (position + 1) + " has been modified!");
    }

    public void removeMakeupShoppingItem (int position) {
        String theItem = makeupShoppingList.get(position);
        makeupShoppingList.remove(position);
    }

    public String findMakeupItem (String searchItem) {
        int position = makeupShoppingList.indexOf(searchItem);

        if (position >= 0) {
            return makeupShoppingList.get(position);
        }
        return null;
    }
}
