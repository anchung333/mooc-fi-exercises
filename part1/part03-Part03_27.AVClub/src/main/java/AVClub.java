
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            
            String[] split = words.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("av")) {
                    System.out.println(split[i]);
                }
            }
        }

    }
}
