import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
		System.out.print("Input Product Name 	: ");
		String productNameString = scan.nextLine();
		
		System.out.print("\"Input Product Unit 	: ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input price per unit 	: ");
		float productPrice = scan.nextFloat();
		
		float totalPriceProduct = productUnit*productPrice;
		
		System.out.println("----------------------------------------");
		System.out.println("Total Price is "+frm.format(totalPriceProduct) +" baht.");
		System.out.println("----------------------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = scan.nextInt();
		System.out.println("----------------------------------------");
	
		float totalDiscount = totalPriceProduct * discount/100;
		System.out.println("Discount from "+discount+"%\t" +frm.format(totalDiscount)+" baht.");
		
		float totalAmount = totalPriceProduct - totalDiscount;
		System.out.println("Amount to be paid \t"+frm.format(totalAmount)+" baht.");
		
		scan.close();
	}

}
