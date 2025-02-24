
public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if(Character.toLowerCase(gender) == 'm') {
			return "Male";
		}
		
		else if(Character.toLowerCase(gender) == 'f') {
			return "Female";
		}
		
		return " ";
	}
}
