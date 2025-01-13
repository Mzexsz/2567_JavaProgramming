
public class Employee {
	private String name;
	private int hoursWorded;
	private double hourlyRate;
	
	public void setEmployeeDetails(String empName,int hours,double rate) {
		name = empName;
		hoursWorded = hours;
		hourlyRate = rate;
	}
	
	public double calculateSalary() {
		double salary = hoursWorded * hourlyRate;
		if(hourlyRate > 40) {
			double bonus = salary * 0.10;
			salary += bonus;
		}
		return salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Hours Worked: " + hoursWorded);
		System.out.println("Hoirly Rate: " + hourlyRate);
		System.out.println("Total Salary: " + calculateSalary());
	}
}
