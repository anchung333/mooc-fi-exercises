
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                String[] info = row.split(",");
                String age = info[1] + " years";
                if (info[1].equals("1")) {
                    age = info[1] + " year";
                }
                System.out.println(info[0] + ", age: " + age);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
