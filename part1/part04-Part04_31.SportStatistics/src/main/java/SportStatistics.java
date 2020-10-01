
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File name: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int matchCount = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String match = fileScan.nextLine();
                String[] matchInfo = match.split(",");
                if (matchInfo[0].equals(team) || matchInfo[1].equals(team)) {
                    matchCount++;
                    int teamIdx = (matchInfo[0].equals(team)) ? 0 : 1;
                    int teamPoints = Integer.valueOf(matchInfo[teamIdx + 2]);
                    int otherPoints = (teamIdx == 0) ? 3 : 2;
                    if (teamPoints > otherPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + matchCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
