package Polymorphism.src;

public class Motherboard extends PersonalComputer{
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer,int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                "} " + super.toString()+ "\n";
    }

    public void loadProgram(String programName){
        System.out.println("Program" + programName + "it is now Loading");
    }
}
