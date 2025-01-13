
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String loanProductName, double loanPrice, double loanInterestRate, int loanYears) {
		productName = loanProductName;
		price = loanPrice;
		interestRate = loanInterestRate;
		years = loanYears;
	}
	
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = interestRate / 100 / 12; 
        int totalMonths = years * 12; 
        return (price * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths)) /
               (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);
	}
	
	public void displayLoanDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Period: " + years + " years");
        System.out.printf("Monthly Payment: %.2f\n", calculateMonthlyPayment());
	}
}
