
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldAge = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int age = Integer.valueOf(input.split(",")[1]);
            if (age > oldAge) {
                oldAge = age;
            }
        }
        System.out.println("Age of the oldest: " + oldAge);
    }
}
