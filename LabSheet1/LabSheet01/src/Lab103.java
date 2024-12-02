import javax.swing.JOptionPane;
public class Lab103 {

	public static void main(String[] args) {
		int minutes = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute):"));       

        int hour = minutes/60;
        int lastMinutes = minutes%60;

        float hourPrice = hour*50;
        float minutesPrice = lastMinutes*.25f;
        float totalPrice = hourPrice+minutesPrice;

        JOptionPane.showMessageDialog(null, "You parking "+ hour+" Hour "+lastMinutes+" Minute." 
                                    +"\nAmount to be paid is "+totalPrice+" baht.");   

	}

}
