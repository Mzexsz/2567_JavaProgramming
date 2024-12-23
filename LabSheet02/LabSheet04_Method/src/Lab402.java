import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		int year = 0;
        boolean isValidYear;

        do {
        	String input = JOptionPane.showInputDialog("Input year:");

            isValidYear = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c < '0' || c > '9') {
                    isValidYear = false;
                    break;
                }
            }

            if (isValidYear) {
                year = Integer.parseInt(input);
                isValidYear = checkYear(year);
            }
        } while (!isValidYear);

        boolean isLeap = isLeapYear(year);
        
        // Show the message
        if (isLeap) {
        	JOptionPane.showMessageDialog(null, year + " is Leap year.");
        } else {
        	JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
        }
    } //end of main() Method

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    } // end of isLeapYear() Method

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    } // end of checkYear() Method

}