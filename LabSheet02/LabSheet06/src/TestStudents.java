
public class TestStudents {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setStudentDetails("intouch", new double[] {85.0,67.0,78.5});
		std2.setStudentDetails("sukolawat", new double[] {90.0,59.8});
		
		line('=');
		System.out.println("Student#1 Detail:");
		std1.displayStudentDetails();
		line('*');
		System.out.println("\nStudent#2 Details:");
		std2.displayStudentDetails();
		line('-');
	}
	
	public static void line(char ch) {
		for(int i = 1; i < 40; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
