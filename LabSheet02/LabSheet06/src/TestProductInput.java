import java.util.Scanner;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product pd1 = new Product();
		
		System.out.print("Enter product name: ");
        String name = scan.nextLine();

        System.out.print("Enter product price: ");
        double price = scan.nextDouble();

        System.out.print("Enter VAT rate (%): ");
        double vatRate = scan.nextDouble();
        System.out.println();
        pd1.setProductDetails(name, price, vatRate);

        pd1.displayProductDetails();

	}

}
