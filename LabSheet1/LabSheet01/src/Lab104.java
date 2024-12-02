import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application");

        String employeeName = JOptionPane.showInputDialog("Enter employee name");

        int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter total hours for this employee."));
    
        float wage = Float.parseFloat(JOptionPane.showInputDialog("Enter wage hour for this employee."));
    
        float earning = hours * wage;

        final float Tax = 0.15f;
        float totalTax = earning * Tax;

        float netEarning = earning - totalTax;

        JOptionPane.showMessageDialog(null, "Employee name: " + employeeName + "\nHours worked: " + hours 
                                    + "\nHourly wage: $ " + wage + "\nGross earnings: $ " + earning
                                    + "\nTax rate: " + Tax + "\nTax: $ " + totalTax
                                    + "\nNet earnings: $ " + netEarning);
	}

}
