import java.awt.GraphicsConfigTemplate;

public class Invoice {
	private int invid;
	private Customer customer; //Composition Concept
	private double amount;
	
	public Invoice(int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvid() {
		return this.invid;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public int getCustomerID() {
		return getCustomer().getCusID();
	}
	
	public String getCustomerName() {
		return getCustomer().getCusName();
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * getCustomerDiscount() / 100);
	}
	
	public String toString() {
		return "Invoice [id=" + getInvid() + ",customer=" + customer.toString() + ",amount=" + getAmountAfterDiscount() + "]" ;
	}
	
	
	
	
	
}
