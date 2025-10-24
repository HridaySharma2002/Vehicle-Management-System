public interface ElectricVehicle{
    void chargeBattery();
    int getBatteryLevel();

    default void displayChargingInfo(){
        System.out.println("Connect charger to the EV port to charge. ");
    }
}