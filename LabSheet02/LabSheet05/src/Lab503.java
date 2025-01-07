import java.util.*;;
public class Lab503 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[7];

        int count = 0;
        String oddOfText = "";

        for(int i = 0; i < num.length; i++){
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = input.nextInt();
        }

        for (int _num : num) 
        {
            if( _num % 2 != 0)
            {
                count++; 
                oddOfText += (_num + " "); 
            }
        }

        System.out.println("\nThere are " + count + " of odd number.");
        System.out.println("List of odd number : " + oddOfText);

        input.close();
    }
}