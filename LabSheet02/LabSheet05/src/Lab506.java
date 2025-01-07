import javax.swing.*;
public class Lab506 {
    public static void main(String[] args) {

        String[] greetOfWord = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};

        String greetOfText = "";

        for (String word : greetOfWord) 
        {
            greetOfText += "\n- " + word; 
        }

        JOptionPane.showMessageDialog(null, "The greeting words ine English:" + greetOfText);
    }
}