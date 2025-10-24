public class Main {
    public static void main(String[] args) {
        // Regular Bike
        System.out.println("=== Bike Details ===");
        Vehicle bike = new Bike("Yamaha", "R15", 180000, false);
        bike.displayInfo();
        bike.start();
        bike.stop();

        System.out.println("\n=== Electric Car Details ===");
        // Electric Car (Multiple Inheritance: Vehicle + ElectricVehicle + SmartFeatures)
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 4800000, 75);
        tesla.displayInfo();
        tesla.start();
        tesla.chargeBattery();
        // FIX: Call the default method using a cast to the interface type
        ((ElectricVehicle) tesla).displayChargingInfo(); 
        tesla.enableAutoDrive();
        tesla.connectToApp();
        tesla.stop();

        // Polymorphism using Interface Reference
        System.out.println("\n=== Interface Polymorphism ===");
        ElectricVehicle evRef = tesla;  // Reference via interface
        evRef.chargeBattery();          // Access only ElectricVehicle methods
        System.out.println("Battery Level via Interface: " + evRef.getBatteryLevel() + "%");
    }
}