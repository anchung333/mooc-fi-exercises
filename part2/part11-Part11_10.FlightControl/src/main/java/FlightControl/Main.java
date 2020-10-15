package FlightControl;

import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl fc = new FlightControl();
        TextInterface ui = new TextInterface(fc, scanner);
        ui.start();
    }
}
