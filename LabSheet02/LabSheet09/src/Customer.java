
public class Customer {
	private int cid;
	private String name;
	private int discount;
	
	public Customer(int cid, String name, int discount) {
		this.cid = cid;
		this.name = name;
		this.discount = discount;
	}
	
	public int getCusID() {
		return this.cid;
	}
	
	public String getCusName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return getCusName() + "(" + getCusID() + ")(" + getDiscount() + "%)";
	}
	
	
	
}
