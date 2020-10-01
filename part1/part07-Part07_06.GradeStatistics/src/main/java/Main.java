
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeLog gl = new GradeLog();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            gl.addGrade(input);
        }
        
        System.out.println("Point average (all): " + gl.average());
        System.out.println("Point average (passing): " + ((gl.averagePassing() > 0) ? gl.averagePassing() : "-"));
        System.out.println("Pass percentage: " + gl.percentPassing());
        System.out.println("Grade distribution: ");
        gl.printGradeDist(gl.gradeDist());
    }
}
