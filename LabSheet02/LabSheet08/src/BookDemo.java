import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Input author name : ");
        String authorName = scan.nextLine();
        
        System.out.print("Input author e-mail : ");
        String authorEmail = scan.next();
        scan.nextLine();
        
        Author author1 = new Author(authorName,authorEmail);
        System.out.println(author1);
        
        System.out.println();
        System.out.print("Input book title : ");
        String bookTitle = scan.nextLine();
        
        System.out.print("Input book page : ");
        int bookPages = scan.nextInt();

        System.out.println();
        Book book = new Book(bookTitle, author1, bookPages);
        System.out.println(book.toString());

        scan.close();
    }
}
