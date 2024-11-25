import java.util.*;
import java.text.*; //use DecimalFormat
public class JavaExample1 {

	public static void main(String[] args) {
		//define object for scanner class(input data from keyboard)
		Scanner scan = new Scanner (System.in);
		//define object format number by DecimalFormat
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
			//สั่งแสดงและรับชื่อสินค้า
			System.out.print("Input product name : ");
			String productName = scan.nextLine();
			
			//สั่งแสดงและรับสินค้า
			System.out.print("Input product unit : ");
			int productUnit = scan.nextInt();
			
			//สั่งแสดงและรับราคาสินค้า
			System.out.print("Input price per unit : ");
			float productPrice = scan.nextFloat();
			
			System.out.println();
			System.out.println("Product name is : "+ productName);
			
			//คำนวณราคาสินค้ารวม
			float totalPriceProduct = productUnit*productPrice;
			System.out.println("Total Price is "+ frm.format(totalPriceProduct) +" baht.");
			
			//คิด vat 7%
			float totalVat = totalPriceProduct + (totalPriceProduct * 7/100);
			System.out.println("Add VAT 7% is "+ frm.format(totalVat) +" baht.");
			
			//Output using
			System.out.println("*******using printf and String.format*******");
			System.out.printf("Product name is : %s",productName);
			System.out.printf("\nTotal price is %,.2f",totalPriceProduct);
			System.out.printf("\nAdd VAT 7%% is %s baht.",String.format("%,.2f",totalVat));
			
			scan.close();
	}

}
