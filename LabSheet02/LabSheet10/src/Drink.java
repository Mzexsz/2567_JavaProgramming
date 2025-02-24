
public class Drink{
	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	public Drink(){}
	
	public String getTypeName() {
		if(type == 1) {
			return "Hot";
		}
		else if(type == 2){
			return "Cold";
		}
		
		return null;
	}
	
	public int getTypePirce() {
		if(type == 1) {
			return 10;
		}
		else if(type == 2){
			return 20;
		}
		
		return 0;
	}
	
	public String getSizeName() {
		if(Character.toLowerCase(size) == 's') {
			return "Small";
		}
		else if(Character.toLowerCase(size) == 'm') {
			return "Medium";
		}
		else if(Character.toLowerCase(size) == 'l') {
			return "Large";
		}	
		
		return null;
	}
	
	public int getSizePrice() {
		if(Character.toLowerCase(size) == 's') {
			return 15;
		}
		else if(Character.toLowerCase(size) == 'm') {
			return 20;
		}
		else if(Character.toLowerCase(size) == 'l') {
			return 25;
		}	
		
		return 0;
	}
	
	public int getTotalPrice() {
		return getTypePirce() + getSizePrice();
	}
}