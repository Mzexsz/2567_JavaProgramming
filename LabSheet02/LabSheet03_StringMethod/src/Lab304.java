import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		
		String firstName = "";
		String lastName = "";
		
		if(!fullName.contains(" ")) 
		{
			System.out.println("Incorrect Name");
		}
		else
		{
			int empty = fullName.indexOf(" ");	
			firstName = fullName.substring(0, empty);
			lastName = fullName.substring(empty + 1, fullName.length());

			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + lastName.toLowerCase());
		}
	input.close();
	}

}