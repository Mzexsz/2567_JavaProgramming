
public class SmartPhone {
	private String brand;
    private String model;
    private int storageCapacity;
    final private int MAX_STORAGE_CAPACITY = 512;

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getStorageCapacity(){
        return storageCapacity;
    }

    public void setBrand(String brand){
        if(brand.length() <= 2){
            System.out.println("Error: Brand must have at least 2 characters!");
        }
        else{
            this.brand = brand;
        }
    }

    public void setModel(String model){
        if(model.length() <= 2){
            System.out.println("Error: Model must have at least 2 characters!");
        }
        else{
            this.model = model;
        }
    }

    public void setStorageCapacity(int storageCapacity){
        if(storageCapacity >= 1 && storageCapacity <= MAX_STORAGE_CAPACITY){
            this.storageCapacity = storageCapacity;
        }
        else{
            System.out.println("Error: Storage capacity must be between 1 and " + MAX_STORAGE_CAPACITY + " GB!");
        }
    }

    public void increaseStorage(int additionalStorage){
        if(additionalStorage > 0 && (storageCapacity + additionalStorage) <= MAX_STORAGE_CAPACITY){
            storageCapacity += additionalStorage;
        }
        else if((storageCapacity + additionalStorage) >= MAX_STORAGE_CAPACITY){
            System.out.println("Error storage capacity cannot exceed " + MAX_STORAGE_CAPACITY + " GB!");
        }
        else{
            System.out.println("Error: Additional storage must be positive!");
        }
    }

    public int getRemainingStorage(int usedStorage){
        if(usedStorage >= 0 && usedStorage <= storageCapacity){
            return storageCapacity - usedStorage;
        }
        System.out.println("Error: Used storage must be between 0 and " + storageCapacity + " GB!");
        return -1;
    }

    public void printDetails(){
        System.out.println("Smartphone Details:" + "\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nStorage Capacity: " + getStorageCapacity() + " GB");
    }
}