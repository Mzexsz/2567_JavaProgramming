import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int num1 = input.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			int num2 = input.nextInt();
			if (num2 < num1) {
				System.out.print("\nBYE BYE");
				break;
			}
			num1 = num2;
		}
		

	}

}
