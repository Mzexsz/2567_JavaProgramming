import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + frm.format(balance) + "\nInput money to withdraw:"));
		if(moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw>50000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 50,000 baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw%100 != 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + (moneyWithdraw%100) + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw is " + frm.format(moneyWithdraw) + " baht." + "\n1,000 = " + (moneyWithdraw/1000) + "\n500 = " + ((moneyWithdraw%1000)/500) + "\n100 = " + (((moneyWithdraw%1000)%500)/100));
		}

	}

}
