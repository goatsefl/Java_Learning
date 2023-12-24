package Polymorphism.src;
public class PersonalComputer extends Product{
    private Motherboard motherboard;
    private Monitor monitor;
    private ComputerCase ccase;

    /*
    Composition is HAS A relation, In this example we will look into how it is different
    from basic Inheritance and the differences between them.
    */

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, Monitor monitor, ComputerCase ccase) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.ccase = ccase;
    }


    public Motherboard getMotherboard() {
        return motherboard;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public ComputerCase getCcase() {
        return ccase;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "motherboard=" + motherboard +
                ", monitor=" + monitor +
                ", ccase=" + ccase +
                "} " + super.toString();
    }
}