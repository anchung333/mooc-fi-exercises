
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int con1 = 0;
        int con2 = 0;
        while (true) {
            System.out.println("First: " + con1 + "/100");
            System.out.println("Second: " + con2 + "/100");
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputs = input.split(" ");
            String keyword = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            if (keyword.equals("add")) {
                if (amount > 0) {
                    con1 = (con1 + amount > 100) ? 100 : (con1 + amount);
                }
            } else if (keyword.equals("move")) {
                if (amount > 0) {
                    int moveAmount = (con1 - amount < 0) ? con1 : amount;
                    con1 -= moveAmount;
                    con2 = (con2 + moveAmount > 100) ? 100 : (con2 + moveAmount);
                }
            } else if (keyword.equals("remove")) {
                if (amount > 0) {
                    con2 = (con2 - amount < 0) ? 0 : (con2 - amount);
                }
            }
            
            

        }
    }

}
