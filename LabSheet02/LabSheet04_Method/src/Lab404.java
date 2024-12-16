import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();
	}//end of main() Medthod
	
	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		String studentId;
		String subjectId;
		
		while(true) {
			//รับรหัสนักศึกษา
			System.out.print("Enter Student Id: ");
			studentId = input.next();
			//รับรหัสวิชา
			System.out.print("Enter Subject Id: ");
			subjectId = input.next();
			
			if(isLength(studentId, subjectId)) {
				System.out.println();
				boolean isITStudent = isITStudent(studentId);
				boolean isITSubject = isITSubject(subjectId);
				displayData(isITStudent, isITSubject, studentId, subjectId);
				break;
            } 
        }
        input.close();
	} //end of inputStudent() Method

	public static boolean isLength(String studentID, String subjectID) {
		return studentID.length() == 10 && 
			   subjectID.length() == 7;
	} //end of isLengh() Method
	
	public static boolean isITStudent(String studentId) {
		return studentId.charAt(2) == '1' && 
	           studentId.substring(3, 6).equals("311");
	} //end of isITStudent() Method
	
	public static boolean isITSubject(String subjectId) {
        return subjectId.startsWith("21") && 
        	   subjectId.charAt(4) == '1';
    } //end of isITSubject() Method
	
	public static void displayData(boolean isITStudent, boolean isITSubject, String studentId, String subjectId) {
		if (isITStudent && isITSubject) { //กรอกรหัสนักศึกษาและรหัสวิชาถูกต้อง 
			System.out.println("Student id: " + studentId + " 1st year student in IT and" 
		                      + "\nEnroll in courses for Year 1");
		}
		else if (isITStudent && !isITSubject) { //กรอกรหัสนักศึกษาถูกและรหัสวิชาผิด
			System.out.println("Student id: " + studentId + " 1st year student in IT" 
							  + "\nnot enroll in courses for Yer 1");
		}
		else { // กรอกรหัสนักศึกษาผิดและรหัสวิชาถูกต้อง
			System.out.println("Student id: " + studentId + " is not 1st year student in IT"
					          + "\nEnroll in courses for Year 1");
		}
	} //end of displayData() Method
}
