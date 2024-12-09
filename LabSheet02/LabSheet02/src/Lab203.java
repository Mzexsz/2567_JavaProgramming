import javax.swing.*;
import java.text.*;
public class Lab203 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat(".0");
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		inputHeight = inputHeight / 100;
		
		double bmi = inputWeight / (inputHeight * inputHeight);
		if(bmi < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) + "\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) + "\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi >= 25.0 && bmi <= 29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) + "\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) + "\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}

	}

}
