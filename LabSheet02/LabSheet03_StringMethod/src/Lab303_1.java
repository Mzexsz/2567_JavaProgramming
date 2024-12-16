import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input a sentence:");

        int spaceCount = 0;
        int wordCount = 0;

        while (!input.endsWith(".")) {
            input = JOptionPane.showInputDialog("Input a sentence, again:");
        }

        for (int i = 0; i < input.length(); i++) {
            char countSpace = input.charAt(i);
            if (countSpace == ' ') {
            	spaceCount++;
            }
        }

        String[] split = input.split(" ");
        for (int i = 0; i < split.length; i++) {
        	wordCount++;
        }

        JOptionPane.showMessageDialog(null, "This sentence has " + spaceCount + " spacebar." + "\nThis sentence has " + wordCount + " word.");
    }

}