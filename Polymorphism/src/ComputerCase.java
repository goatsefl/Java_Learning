package Polymorphism.src;

public class ComputerCase extends PersonalComputer{

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public ComputerCase(String model, String manufacturer,String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public String pressPowerButton(){
        return "Pc is Turning On";
    }
}
