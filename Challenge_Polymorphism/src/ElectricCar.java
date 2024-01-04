package Challenge_Polymorphism.src;

public class ElectricCar extends Car {

    private double avgKmPerLitre;
    private static double zeroToSixty = 2.1;
    private static double zeroToHundred = 2.8;
    private int batterySize;

    public static double getZeroToSixty() {
        return zeroToSixty;
    }

    public static double getZeroToHundred() {
        return zeroToHundred;
    }

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }


}

