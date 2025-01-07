import javax.swing.*;
public class Lab507 {
    public static void main(String[] args) {
        int[] num = new int[5];

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number " + (i + 1) + " :"));
        }

        ShowEven(num);
        ShowOdd(num);
    } //End of main() Method

    public static void ShowEven(int[] nums){
        String even = "";

        for (int _nums : nums) 
        { 
            if(_nums % 2 == 0){ 
                even += _nums + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "List of even number:\n" + even);
    } //End of ShowEven() Method

    public static void ShowOdd(int[] nums){
        String odd = "";

        for (int _nums : nums) 
        { 
            if(_nums % 2 != 0){ 
                odd += _nums + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "List of odd number:\n" + odd);
    } //End of ShowOdd() Method
}