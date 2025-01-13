import java.util.*;
public class TestEmployeeinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter detail for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Workes: ");
		int empHoursWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		System.out.println("\nEmployee 1 Details:");
		emp1.displayEmployeeDetails();
		
		scan.nextLine();
		
		System.out.println("\nEnter detail for Employee 2:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Workes: ");
		int empHoursWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();

	}

}
