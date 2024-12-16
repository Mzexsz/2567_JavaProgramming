import java.util.*;
public class Lab307 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Text: ");
        String text = input.nextLine().toLowerCase();
        text = text.replaceAll(" ", "");

        boolean palindrome = true;
        int leftText = 0; 
        int rightText = text.length() - 1;
        
        while (leftText < rightText) 
        {
            if(text.charAt(leftText) != text.charAt(rightText))
            {
                palindrome = false;
            }
            	leftText++;
            	rightText--;
        }
        if(palindrome){
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
        input.close();
	}

}