
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        String isLeapYear = " not ";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = (year % 400 == 0) ? " " : " not ";
            } else {
                isLeapYear = " ";
            }
        }
        System.out.println("This year is" + isLeapYear + "a leap year.");
    }
}
