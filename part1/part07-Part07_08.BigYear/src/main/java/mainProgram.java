
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds(scan);
        while (true) {
            System.out.print("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                birds.addBird();
            } else if (command.equals("Observation")) {
                System.out.println(birds.addObservation());
            } else if (command.equals("All")) {
                birds.listBirds();
            } else if (command.equals("One")) {
                birds.listOne();
            }
        }
    }

}
