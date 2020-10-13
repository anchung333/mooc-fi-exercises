
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String[]> countries = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Paths.get("literacy.csv"));
            while (scanner.hasNextLine()) {
                String[] row = scanner.nextLine().split(",");
                String[] toAdd = Arrays.copyOfRange(row, 2, row.length);
                toAdd[0] = toAdd[0].contains("female") ? "female" : "male";
                countries.add(toAdd);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        countries.stream().sorted((r1, r2) -> {
            double diff = Double.valueOf(r1[3]) - Double.valueOf(r2[3]);
            if (diff > 0.0) {
                return 1;
            } else if (diff < 0.0) {
                return -1;
            }
            return 0;
            }).forEach(row -> System.out.println(row[1] + " (" + row[2] + "), " + row[0] + ", " + row[3]));
    }
}
