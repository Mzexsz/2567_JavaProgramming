
public class DemoCar {
	
    public static void main(String[] args){
    	Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);

    	System.out.println("Company Name: " + car.getCompanyName() + "\nModel Name: " + car.getModelName() + "\nYear: " + car.getYear() + "\nMileage: " + car.getMileage());
    	System.out.println();

    	System.out.println("Updated Car Details:");
    	car.setCompanyName("Toyota");
    	car.setModelName("Corolla");
    	car.setYear(2015);

    	System.out.println("Company Name: " + car.getCompanyName() + "\nModel Name: " + car.getModelName() + "\nYear: " + car.getYear());
    
    	car.setYear(1885);
    	car.setCompanyName(null);
    }
}