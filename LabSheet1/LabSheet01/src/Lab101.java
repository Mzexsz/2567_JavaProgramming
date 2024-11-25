import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Input Product Name : ");
		String productNameString = scan.nextLine();
		
		System.out.print("\"Input Product Unit : ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		float totalPriceProduct = productUnit*productPrice;
		System.out.println("----------------------------------------");
		System.out.println();
		
		

	}

}
