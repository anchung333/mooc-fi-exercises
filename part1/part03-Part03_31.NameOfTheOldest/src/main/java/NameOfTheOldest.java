
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        int oldAge = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String name = input.split(",")[0];
            int age = Integer.valueOf(input.split(",")[1]);
            if (age > oldAge) {
                oldest = name;
                oldAge = age;
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
