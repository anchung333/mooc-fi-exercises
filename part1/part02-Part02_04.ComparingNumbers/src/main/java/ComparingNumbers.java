
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        String resp = " ";
        if (first == second) {
            resp = " is equal to ";
        } else {
            resp = (first < second) ? " is smaller than " : " is greater than ";
        }
        System.out.println(first + resp + second + ".");
    }
}
