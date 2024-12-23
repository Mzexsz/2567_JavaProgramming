import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] score = new double[5];
		double sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("Input score of student " + (i+1) +": ");
			score[i] = input.nextDouble();
			sum += score[i];
		} //end of for
		
		System.out.println();
		
		double average = sum / score.length;
		System.out.printf("\nAverage of 5 students is %.2f\n", average);
		
		int studentIndex = 1;
        for (double _score : score) {
            if (_score > average) {
                System.out.printf("> Student %d (%.2f)\n", studentIndex, _score);
            }
            studentIndex++;
        }
	}

}
