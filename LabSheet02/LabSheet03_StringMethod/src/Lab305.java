import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Input some sentence : ");
        String sentence = input.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point : ");
            sentence = input.nextLine();
        }
        System.out.println();

        int start = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
                if (i == sentence.length() - 1 && sentence.charAt(i) == '.') {
                    System.out.println(sentence.substring(start, i + 1));
                } else {
                    System.out.println(sentence.substring(start, i));
                }
                start = i + 1;
            }
        }

        input.close();

	}

}