import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = scan.nextLine();
			
			//Check if user wants to exit
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate.");
			}
			
			//Validate password
			String error = "";
			//Check for minimum length
			if (password.length() < 8) {
				error += "- Password must be at least 8 character long.\n";
			}
			
			//Check foe Upper case,Lower case,Digit
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i = 0;i < password.length();i++) {
				char ch = password.charAt(i);
				if(ch >= 'A' && ch <= 'Z') { //เช็คตัวพิมใหญ่
					hasUpperCase = true;
				}
				else if (ch >= 'a' && ch <= 'z') { //เช็คตัวพิมพ์เล็ก
					hasLowerCase = true;
				}
				else if (ch >= '0' && ch <= '9') { //เช็คตัวเลข
					hasDigit = true;
				}
			}//end of for
			
			//Concatenate errors based on missing criteria
			if(!hasUpperCase) {
				error += "- Password must contain at least one uppercase etter(A-Z).\n";
			}
			if(!hasLowerCase) {
				error += "- Password must contain at least one lowercase etter(a-z).\n";
			}
			if (!hasDigit) {
				error += "- Password must contain at least one digit etter(0-9).\n";
			}
			
			//Display errors or success message
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(error);
			}
			
			
		}//end while
		scan.close();
		

	}

}
