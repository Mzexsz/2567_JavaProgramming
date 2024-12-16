import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName; //The input line entered by the user
		String firstName; // The first name, extracted from the input.
		
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); //ค้นหาการเคาะ space จากตัวแปร fullName
		firstName = fullName.substring(0, space); //จะได้ชื่อแรกใส่ตัวแปร firstName
		
		System.out.println(abbreviatName(fullName)+firstName);
		input.close();
	} //end main() Method
	
	public static String abbreviatName(String fullName) {
		String initialLetter = "";
		
		for(int i = 0; i < fullName.length(); i++) 
		{
			if(fullName.charAt(i)==' ') {
				initialLetter = (initialLetter+fullName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter + ".";
				
			}
		}
		return initialLetter;
	}

}
