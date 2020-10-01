
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int to = Integer.valueOf(scanner.nextLine());
        int from = Integer.valueOf(scanner.nextLine());
        
        if (from <= to) {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }
    }
}
