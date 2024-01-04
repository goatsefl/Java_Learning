package Challenge_Polymorphism.src;

public class HybridCar extends Car{

    private static double zeroToSixty = 3.2;
    private static double zeroToHundred = 4.3;
    private double avgKmPerLitre;

    public static double getZeroToSixty() {
        return zeroToSixty;
    }

    public static double getZeroToHundred() {
        return zeroToHundred;
    }

    private int batterySize;
    private int cylinders;

    public HybridCar(String description,double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
