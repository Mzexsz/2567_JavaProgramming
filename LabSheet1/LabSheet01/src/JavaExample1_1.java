import java.util.*;
public class JavaExample1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define object for scanner class(input data from keyboard)
		Scanner input = new Scanner (System.in);
		
		//รับข้อมูลด้วย next()
		System.out.print("Enter your first name(using next): ");
		String firstName = input.next();
		input.nextLine();
		
		//รับข้อมูลด้วย nextLine()
		System.out.print("Enter your last name(usinf nextLine): ");
		String lastName = input.nextLine();
		
		System.out.println("\n----Output----");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		
		
		input.close();
	}

}
