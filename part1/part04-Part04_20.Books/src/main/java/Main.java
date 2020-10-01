import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(title, pages, pubYear);
            bookList.add(newBook);
        }
        
        System.out.println("What information will be printed? ");
        String infoToPrint = scanner.nextLine();
        if (infoToPrint.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
}
