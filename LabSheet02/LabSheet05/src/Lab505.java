import java.util.*;
public class Lab505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = {78, 36, 58, 41, 25, 92, 75};

        int index;
        String current;
        String next;

        System.out.print("Input index of array : ");
        index = input.nextInt();

        while (true) 
        {
            if(index < 0 || index >= num.length){
                System.out.print("Input index of array, again : ");
                index = input.nextInt();
            }
            else{
                break;
            }
        }

        current = "\nValue is current index is " + num[index];
        next = (index + 1 >= num.length) ? "\nSorry, " + index + " is the last index in array." : "\nValue is next    index is " + num[index + 1];

        System.out.println(current + next);

        input.close();
    }
}