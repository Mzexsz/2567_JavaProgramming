
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeDetails("John", 45, 20.0);
		emp2.setEmployeeDetails("Jane", 38, 25.0);
		
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();
	}

}
