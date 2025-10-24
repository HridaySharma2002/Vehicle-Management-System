public abstract class Vehicle{
    private String brand;
    private String model;
    private double price;
    
    public Vehicle(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    //Getters and Setters
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Invalid Price");
        }
    }

    public abstract void start();
    public abstract void stop();

    public void displayInfo(){
        System.out.println("Brand: "+brand+", Model: "+model+",Price: ₹"+price);
    }
}

