import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		double discount;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		double totalPrice = numberofCustomer * BUFFET;
		
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(totalPrice) + " baht." + "\nDo you have a member card?");
		}while(isMember == 2);
		
		if(isMember == 0) { //if (isMember == JOptionPane.YES_OPTION)
			discount = totalPrice * 0.90;
			JOptionPane.showConfirmDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
		}
		else if (isMember == 1) { //if (isMember == JOptionPane.NO_OPTION)
			JOptionPane.showConfirmDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht.");
		}
		
	}

}
