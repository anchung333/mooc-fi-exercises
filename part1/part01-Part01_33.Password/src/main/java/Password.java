
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String input = scan.nextLine();
        String response = (input.equals("Caput Draconis")) ? "Welcome!" : "Off with you!";
        System.out.println(response);
    }
}
