
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        int abs = (num < 0) ? (num * -1) : num;
        System.out.println(abs);
    }
}
