import java.util.*;
public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SALARY_CEILING = 6000;
        final float EMPLOYEE_RATE_55_AND_BELOW = 0.2f;
        final float EMPLOYER_RATE_55_AND_BELOW = 0.17f;
        final float EMPLOYEE_RATE_55_TO_60 = 0.13f;
        final float EMPLOYER_RATE_55_TO_60 = 0.13f;
        final float EMPLOYEE_RATE_60_TO_65 = 0.075f;
        final float EMPLOYER_RATE_60_TO_65 = 0.09f;
        final float EMPLOYEE_RATE_65_ABOVE = 0.05f;
        final float EMPLOYER_RATE_65_ABOVE = 0.075f;

        int salary, age; 
        int contributableSalary;
        float employeeContribution, employerContribution, totalContribution;

        System.out.print("Enter the monthly salary: $");
        salary = scanner.nextInt();   
        System.out.print("Enter the age: ");
        age = scanner.nextInt();
       
        contributableSalary = SALARY_CEILING;
        if(salary > contributableSalary){
            salary = contributableSalary;
        }

        if (age <= 55) { 
            employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
        } 
        else if (age <= 60) { 
            employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = salary * EMPLOYER_RATE_55_TO_60;
        } 
        else if (age <= 65) { 
            employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = salary * EMPLOYER_RATE_60_TO_65;
        } 
        else { 
            employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
        }

        System.out.printf("The employee's contribution is: $%.2f", employeeContribution);
        System.out.printf("\nThe employer's contribution is: $%.2f", employerContribution);

        totalContribution = employeeContribution + employerContribution;

        System.out.printf("\nThe total contribution is: $%.2f", totalContribution);

        scanner.close();
    }
}