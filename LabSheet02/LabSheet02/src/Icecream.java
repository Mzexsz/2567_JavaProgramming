import javax.swing.*;

public class Icecream {
    public static void main(String[] args) {
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        int totalPrice, iceFlavor, choose;
        String toppingText = "";
        iceFlavor = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B." + "\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:"));

        while (iceFlavor < 1 || iceFlavor > 2) 
        {
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! " + "\nTry again...", "ERROR", JOptionPane.ERROR_MESSAGE);

            iceFlavor = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B." + "\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:"));
        }    

        totalPrice = iceFlavor == 1 ? VANILLA : CHOCOLATE;
        
        choose = JOptionPane.showConfirmDialog(null, "Do you want to add a topping?", "Topping", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                      
        totalPrice += choose == 0 ? TOPPING : 0; 
        toppingText = choose == 0 ? "with topping" : "no topping"; 

        JOptionPane.showMessageDialog(null, "You choose Chocolate Flavor" + "\nAnd " + toppingText + "\nTotal Price = " + totalPrice + " baht.");
    }
}