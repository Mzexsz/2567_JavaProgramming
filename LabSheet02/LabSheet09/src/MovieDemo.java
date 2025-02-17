import java.util.*;
public class MovieDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input movie id    : ");
		String movieId = scanner.nextLine();
		System.out.print("Input movie name  : ");
		String movieName = scanner.nextLine();
		System.out.println();
		
		System.out.print("Input director name   : ");
		String directorName = scanner.nextLine();
		System.out.print("Input director e-mail : ");
		String directorEmail = scanner.nextLine();
		System.out.print("Input director gender : ");
		char gender = scanner.next().charAt(0);
		scanner.nextLine();
		
		while(Character.toLowerCase(gender) != 'm' || Character.toLowerCase(gender) != 'f') {
			System.out.print("Input director gender, again : ");
			gender = scanner.next().charAt(0);
			scanner.nextLine();
		}
		System.out.println();
		
		System.out.print("Input movie thearter no.     : ");
		int theaterNo = scanner.nextInt();
		scanner.nextLine();
		
		while(theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println();
		
		Director director = new Director(directorName, directorEmail, gender);
		
		Theater theater = new Theater(movieId, movieName, director, theaterNo);
		System.out.println(theater);
		
		scanner.close();
	}
}