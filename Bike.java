public class Bike extends Vehicle {
    private boolean hasKickStart;

    public Bike(String brand, String model, double price, boolean hasKickStart) {
        super(brand, model, price);
        this.hasKickStart = hasKickStart;
    }

    @Override
    public void start() {
        if (hasKickStart)
            System.out.println(getBrand() + " " + getModel() + " starts with a kick.");
        else
            System.out.println(getBrand() + " " + getModel() + " starts with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " stops using disc brakes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kick Start: " + (hasKickStart ? "Yes" : "No"));
    }
}