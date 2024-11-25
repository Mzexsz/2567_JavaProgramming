import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		//Input product unit
		String productUnitStr = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(productUnitStr);
		//Input price per unit
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit:"));
		
		double totalPrice = productPrice * productUnit;
		
		double totalVat = totalPrice+ (totalPrice * 7/100);
		
		//Format output
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		
		String frmTotalVat = String.format("%,.2f", totalVat);
		
		//Display result by Dialog box
		JOptionPane.showConfirmDialog(null,"Total Price is "+frmTotalPrice+" baht."
					+"\nAdd VAT 7% is "+frmTotalVat+" baht.");

	}

}
