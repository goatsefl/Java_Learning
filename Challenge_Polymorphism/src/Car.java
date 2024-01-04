package Challenge_Polymorphism.src;

public class Car {
    public String description;

    public Car(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void startEngine(int x){

        Integer i = x;
        if(i.equals(0)){
            System.out.println("Engine is turned off: Press the button to turn it on");
        }
        else if (i.equals(1)) {
            System.out.println("Engine is turned on: Press again to turn it off");
        }
    }

    public void drive (String mode,int eco, int cruise, int sport){
        switch(mode) {
            case "Eco":
                System.out.println("The drive mode is set to Eco " + eco);
                break;
            case "Cruise":
                System.out.println("The drive mode is set to Cruise " + "Cruise carefully, speed : " + cruise);
                break;
            case "Sport":
                System.out.println("The drive mode is set to Sport " + "Speed will be more than 110KMPH" + sport);
                break;
            default:
                System.out.println("Manual Mode activated");
                break;
        }
    }

    protected void runEngine(ElectricCar e ,GasCar g,HybridCar h){

    }


    public double Acceleration(double x){

        if (x < 3){
            return ElectricCar.getZeroToSixty();
        }
        else if(x > 3) return GasCar.get;
    }
}
