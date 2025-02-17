
public class Barista {
	private String name;
	private char gender;
	
	Barista(String name,char gender){
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {
		this.name = "";
		this.gender = ' ';
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if (gender == 'M') {
            return "Male";
        } else if (gender == 'F') {
            return "Female";
        } else {
            return " ";
        }
	}
}
