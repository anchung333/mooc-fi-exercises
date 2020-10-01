
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String keyword = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);
            if (amount < 0) {
                amount = 0;
            }
            
            if (keyword.equals("add")) {
                first = (first + amount > 100) ? 100 : (first + amount);
            }
            
            if (keyword.equals("remove")) {
                second = (second - amount > 0) ? (second - amount) : 0;
            }
            
            if (keyword.equals("move")) {
                if (first - amount < 0) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second = (second + amount > 100) ? 100 : (second + amount);
                }
            }
        }
    }

}
