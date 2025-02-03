import java.util.Scanner;
import java.text.*;
public class StockProduct {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Product[] productList = new Product[4];

        for (int i = 0; i < productList.length; i++) {
            productList[i] = new Product();

            System.out.print("Input product Id: ");
            String id = scanner.nextLine();
            productList[i].setId(id);

            int unit;
            System.out.print("Input product Unit: ");
            unit = scanner.nextInt();
            productList[i].setUnit(unit);

            double price;
            do {
                System.out.print("Input product Price: ");
                price = scanner.nextDouble();
                if (price <= 0) {
                    System.out.println("Price must be greater than 0. Please enter again.");
                }
            } while (price <= 0);
            productList[i].setPrice(price);
            System.out.println();
            scanner.nextLine(); 
        }
        Line();

        double totalValue = 0;
        for (Product productLists : productList) {
            double totalPrice = productLists.calculate();
            System.out.println("Product ID: " + productLists.getId() + ", Total price = " + df.format(totalPrice) + " baht.");
            totalValue += totalPrice;
        }
        
        Line();
        System.out.println("Total price of all products is " + df.format(totalValue) + " baht.");
        scanner.close();
    }
    
    public class CheckStockProduct {
    	
    }
    
    
    public static void Line() {
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
