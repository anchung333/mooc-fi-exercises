
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation:");
            int ageRec = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, ageRec));
        }
        
        Comparator<Book> comparing = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparing);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

}
