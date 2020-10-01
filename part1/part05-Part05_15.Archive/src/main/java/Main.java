
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            Item newItem = new Item(id, name);
            boolean isInList = false;
            for (Item listItem : items) {
                if (listItem.equals(newItem)) {
                    isInList = true;
                    break;
                }
            }
            if (isInList == false) {
                items.add(newItem);
            }
        }
        
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
