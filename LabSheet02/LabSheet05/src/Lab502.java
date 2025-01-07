import java.util.*;
public class Lab502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        
        for(int i = 0; i < num.length; i++){
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = input.nextInt();

            while (true) 
            {
                if(num[i] < 0){
                    System.out.print("Input number, again " + (i + 1) + " : ");
                    num[i] = input.nextInt();
                }
                else{
                    break;
                }
            }
            
        }

        System.out.println("\nSummation of positive number is " + SumOfPos(num));
        
        input.close();
    } //End of main() Method

    public static int SumOfPos(int[] num) {
        int sum = 0;

        for (int _num : num) {
            sum += _num;
        }

        return sum;
    } // End of SumOfPos() Method 
}