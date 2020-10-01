
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int smValue = 10000;
        ArrayList<Integer> smIndices = new ArrayList<Integer>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
            if (input < smValue) {
                smValue = input; 
                smIndices.add(numbers.size() - 1);
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("Smallest number: " + smValue);
        for (int index : smIndices) {
            System.out.println("Found at index: " + index);
        }
        
    }
}


