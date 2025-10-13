import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] shoppingList = new String[5];
        int count = 0;

        System.out.println("Enter up to 5 items to buy:");

        for (int i = 0; i < 5; i++) {
            System.out.print("> Item " + (i + 1) + ": ");
            String item = input.nextLine().trim();

            if (item.isEmpty()) { // allow early stop
                break;
            }
            shoppingList[count] = item;
            count++;
        }

        System.out.println("\nYour shopping list:");
        for (int i = 0; i < count; i++) {
            System.out.print(shoppingList[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("\nYou entered " + count + " item(s).");

        System.out.print("\nSearch for an item: ");
        String searchItem = input.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (shoppingList[i].equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("✅ " + searchItem + " is in your shopping list!");
        } else {
            System.out.println("❌ " + searchItem + " is NOT in your shopping list.");
        }

        input.close();
    }
}
