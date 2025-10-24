public class ElectricCar extends Vehicle implements ElectricVehicle, SmartFeatures {
    private int batteryLevel;
    private boolean isAutoDriveEnabled;

    public ElectricCar(String brand, String model, double price, int batteryLevel) {
        super(brand, model, price);
        this.batteryLevel = batteryLevel;
        this.isAutoDriveEnabled = false;
    }

    // Implement abstract methods from Vehicle
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " starts silently with an electric motor.");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " stops using regenerative braking.");
    }

    // Implement methods from ElectricVehicle
    @Override
    public void chargeBattery() {
        System.out.println("Charging the electric car....");
        batteryLevel = 100;
        System.out.println("Battery fully charged....");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Implement methods from SmartFeatures
    @Override
    public void enableAutoDrive() {
        isAutoDriveEnabled = true;
        System.out.println("Auto-drive enabled! The car can drive itself....");
    }

    @Override
    public void connectToApp() {
        System.out.println("Connected to mobile app. You can monitor vehicle stats remotely..");
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Auto-Drive Enabled: " + (isAutoDriveEnabled ? "Yes" : "No"));
    }
}