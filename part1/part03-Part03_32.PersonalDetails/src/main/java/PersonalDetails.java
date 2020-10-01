
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longName = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String name = input.split(",")[0];
            int birthYear = Integer.valueOf(input.split(",")[1]);
            if (name.length() > longName.length()) {
                longName = name;
            }
            sum += birthYear;
            count++;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (1.0*sum/count));
    }
}
