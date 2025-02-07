import java.util.*;
public class StockProduct {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Product[] productList = new Product[4];
		
		for(int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			
			System.out.print("Input product Id    : ");
			productList[i].setId(scanner.nextLine());
			
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scanner.nextInt());
			scanner.nextLine();
			
			while(productList[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again : ");
				productList[i].setUnit(scanner.nextInt());
				scanner.nextLine();
			}
			
			System.out.print("Input product Price : ");
			productList[i].setPrice(scanner.nextDouble());
			scanner.nextLine();
			
			while(productList[i].getPrice() <= 0) {
				System.out.print("Input product Price, again : ");
				productList[i].setPrice(scanner.nextDouble());
				scanner.nextLine();
			}
			
			System.out.println();
		}
		 Line();
		 
		 double total = 0;
		 for (Product _productList : productList) {
			 System.out.printf("Product ID : %s, Total price = %,.2f baht.%n",  _productList.getId(),  _productList.calculate());
			
			total += _productList.calculate();
		}
		 
		 Line();
		 System.out.printf("Total price of all products is %,.2f baht.", total);
		 
		scanner.close();
	}
	
	public static void Line() {
		for(int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}