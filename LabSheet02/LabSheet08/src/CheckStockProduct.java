import java.util.*;
public class CheckStockProduct {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int list = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println();
		
		Product[] productList = new Product[list];
		
		for(int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			
			System.out.print("Input product Id    : ");
			productList[i].setId(scanner.nextLine());

			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println();
		}
		
		Text("LOW");
		
		for (Product _productList : productList) {
			
			if(_productList.getUnit() < 5) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}
		}
		
		Text("NORMAL");
		
		//foreach
		for (Product _productList : productList) {
			if(_productList.getUnit() >= 5 && _productList.getUnit() <= 50) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}
		}
		
		Text("HIGH");
		
		for (Product _productList : productList) {	
			if(_productList.getUnit() > 50) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}
		}
		
		
		scanner.close();
	}
	
	public static void Text(String text) {
		for(int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("List of product in \'" + text +"\' status.");
		
		for(int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}