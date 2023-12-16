import static java.lang.StringTemplate.STR;

public class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    // The toString() method has a small change where, Usage of STR template is used to make the code much more readable and practical for understanding.
    @Override
    public String toString() {
        return STR."Animal{type='\{type}\{'\''}, size='\{size}\{'\''}, weight=\{weight}\{'}'}";
    }
    public void move(String speed){
        System.out.println(STR."\{type} moves \{speed}");
    }
    public void makeNoise(){
        System.out.println(STR."\{type} make some kind of noise");
    }
}
