import javax.swing.*;

public class CoffeeShopDemo {
	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon", 'M');
		Barista staff2 = new Barista("Claire", 'F');

		int typeDrink = Integer.parseInt(JOptionPane.showInputDialog("Drink type: "));
		while (typeDrink != 1 && typeDrink != 2) {
			typeDrink = Integer.parseInt(JOptionPane.showInputDialog("Drink type, again: "));
		}
		
		int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Coffee type: "));

		while (typeCoffee < 1 || typeCoffee > 3) {
			typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Coffee type, again: "));
		}

		String size = JOptionPane.showInputDialog("Coffee size: ");
		char sizeCoffee = size.charAt(0);

		while (Character.toLowerCase(sizeCoffee) != 's' && Character.toLowerCase(sizeCoffee) != 't' && 
				Character.toLowerCase(sizeCoffee) != 'g' && Character.toLowerCase(sizeCoffee) != 'v') {
			size = JOptionPane.showInputDialog("Coffee size, again: ");
			sizeCoffee = size.charAt(0);
		}

		int barisNum = Integer.parseInt(JOptionPane.showInputDialog("Barista number: "));

		Barista serveStaff;
		switch (barisNum) {
			case 2:
				serveStaff = staff2;
				break;
				
			case 1:
			default:
				serveStaff = staff1;
				break;
		}

		Coffee order = new Coffee(typeDrink, sizeCoffee, typeCoffee, serveStaff);
		JOptionPane.showMessageDialog(null, order + 
							"\nBarista: " + order.getBarista().getName() + " (" + order.getBarista().getGenderName() + ")"); 
		
	}

}