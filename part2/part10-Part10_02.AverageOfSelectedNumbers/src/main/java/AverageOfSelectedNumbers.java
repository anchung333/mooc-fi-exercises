
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String posNeg = scanner.nextLine();
        double average;
        if (posNeg.equals("n")) {
            average = inputs.stream().mapToInt(i -> Integer.valueOf(i)).filter(n -> (n < 0)).average().getAsDouble();
            System.out.println("average of the negative numbers: " + average);
        } else {
            average = inputs.stream().mapToInt(i -> Integer.valueOf(i)).filter(n -> (n > 0)).average().getAsDouble();
            System.out.println("average of the negative numbers: " + average);
        }
        
        
    }
}
