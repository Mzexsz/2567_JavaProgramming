public class IncomeTaxCalculator {
	private double income;
	
	public void setIncome(double ITCincome) {
		income = ITCincome;
	}
	
	public double calculateTax() {
        double tax = 0;
        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.05;
        } else if (income <= 500000) {
            tax = (150000 * 0.05) + ((income - 300000) * 0.10);
        } else if (income <= 1000000) {
            tax = (150000 * 0.05) + (200000 * 0.10) + ((income - 500000) * 0.15);
        } else {
            tax = (150000 * 0.05) + (200000 * 0.10) + (500000 * 0.15) + ((income - 1000000) * 0.20);
        }
        return tax;
	}
	public void displayTaxDetails() {
		System.out.println("Income: "+income);
		System.out.println("Tax: "+ calculateTax());
	}
}