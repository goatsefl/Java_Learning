package Polymorphism.src;

public class ComputerCase extends PersonalComputer{
    /*
    ComputerCase extends PersonalComputer, holding powerSupply details.
    Constructors set model, manufacturer, and power supply.
    toString() details the case, while pressPowerButton() signals the PC turning on.
     */

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public ComputerCase(String model, String manufacturer,String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "powerSupply='" + powerSupply + '\'' +
                "} " + super.toString()+ "\n";
    }

    public String pressPowerButton(){
        return "Pc is Turning On";
    }
}
