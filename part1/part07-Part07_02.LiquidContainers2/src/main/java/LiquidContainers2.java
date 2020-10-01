
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + cont1.toString());
            System.out.println("Second: " + cont2.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String keyword = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);
            
            if (keyword.equals("add")) {
                cont1.add(amount);
            }
            
            if (keyword.equals("remove")) {
                cont2.remove(amount);
            }
            
            if (keyword.equals("move")) {
                if (cont1.contains() < amount) {
                    cont2.add(cont1.contains());
                    cont1.remove(amount);
                } else {
                    cont1.remove(amount);
                    cont2.add(amount);
                }
            }

        }
    }

}
