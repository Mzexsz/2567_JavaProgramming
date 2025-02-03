public class Car {
    
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;


    public Car(String companyName, String modelName, int year, double mileage){
        this.companyName = companyName;
        this.modelName = modelName;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(){
        companyName = "Unknown";
        modelName = "Unknown";
        year = (year < 1886) ? 2000 : year;
        mileage = 0.0;
    }


    public void setCompanyName(String companyName){
        if(companyName == null){
            System.out.println("Error: Invlid company or model name!");
        }
        else{
            this.companyName = companyName;
        }
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setModelName(String modelName){
        if(modelName == null){
            System.out.println("Error: Invlid company or model name!");
        }
        else{
            this.modelName = modelName;
        }
    }

    public String getModelName(){
        return modelName;
    }

    public void setYear(int year){
        if(year < 1886){
            System.out.println("Error: Invalid year!");
        }
        else{
            this.year = year;
        }
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }
}