
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
            
            String[] inputs = input.split(" ");
            String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            if (command.equals("add")) {
                cont1.add(amount);
            } else if (command.equals("move")) {
                int moveAmount = ((cont1.contains() - amount) < 0) ? cont1.contains() : amount;
                cont1.remove(moveAmount);
                cont2.add(moveAmount);
            } else if (command.equals("remove")) {
                int removeAmount = (cont2.contains() - amount < 0) ? cont2.contains() : amount;
                cont2.remove(removeAmount);
            }
        }
    }

}
