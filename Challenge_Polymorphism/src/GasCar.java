package Challenge_Polymorphism.src;

public class GasCar extends Car{
    private double avgKmPerLitre;

    private static double zeroToSixty = 2.9;
    private static double zeroToHundred = 3.95;
    private int cylinders;

    public static double getZeroToSixty() {
        return zeroToSixty;
    }

    public static double getZeroToHundred() {
        return zeroToHundred;
    }

    public GasCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
