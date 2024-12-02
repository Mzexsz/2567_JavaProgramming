import java.util.*;
import java.text.*;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes : ");
		int minute = input.nextInt();

		
        int year = minute / 525600; 
        int remainMinute = minute % 525600;
		int day = remainMinute / 1440;   
		System.out.print(minute + " minutes is approximately "+ year + " years and " + day + " days");

        input.close();
	}

}
