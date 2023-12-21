public class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public Motherboard(String model, String manufacturer) {

        super(model, manufacturer);
    }

    public void loadProgram(String programName){}
}
