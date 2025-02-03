import java.util.*;
public class StudentScore {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many students in classroom: ");
		int numberOfStudent = scan.nextInt();
		scan.nextLine();
		
		Student[] students = new Student[numberOfStudent];
		for(int i = 0; i < numberOfStudent; i++) {
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT" + (i+1));
			Line();
			
			System.out.print("Input student name  : ");
			students[i].setName(scan.nextLine()); 
			
			System.out.print("Input student score : ");
			int stdScore = scan.nextInt();
			scan.nextLine();
			students[i].setScore(stdScore); 
			
			while(!students[i].checkScore()) {
				System.out.print("Input student score, again : ");
				stdScore = scan.nextInt();
				students[i].setScore(stdScore); 
			}
		}
		/*System.out.println();
		System.out.println("LIST OF PASS STUDENT(>= 50):");
		Line();
		for(Student student : students) {
			if (student.isPass()) {
				System.out.println(">> " + student.getName() + "(" + student.getScore() + ")");
			}
		}	*/
		
		System.out.println();
		System.out.println("LIST OF PASS STUDENT(>= 50):");
		Line();
		for (Student student : students) {
            if (student.getScore() >= 50) {
                System.out.println(">> " + student.getName() + "(" + student.getScore() + ")" + " get grade " + findGrade(student.getScore()));
            }
	    }	
		
		scan.close();
	}
	
	public static String findGrade(int score) {
		 if (score >= 80 && score <= 100) {
			 return "A";
		 }
		 else if (score >= 75) {
			 return "B+";
		 }
	     else if (score >= 70) {
	    	 return "B";
	     }
	     else if (score >= 65) {
	    	 return "C+";
	     }
	     else if (score >= 60) {
	        	return "C";
	     }
	     else if (score >= 55) {
	        	return "D+";
	     }
	     else if (score >= 50) {
	        	return "D";
	     }
	     else {
	    	 return "F";
	     }
	}

	public static void Line() {
		for(int i = 1; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
}
