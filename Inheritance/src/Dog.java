import java.util.Objects;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog(){
        super("Mark","small",38.46);
    }

    public Dog(String type, double weight){
        this(type,weight,"Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small":(weight < 35 ? "medium": "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return STR."Dog{earShape='\{earShape}\{'\''}, tailShape='\{tailShape}\{'\''}} \{super.toString()}";
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }

    public void makeNoise(){
        if(Objects.equals(type, "Wolf")){
            System.out.println("wooooooooo");
        }
        else{
            bark();
            System.out.println();
        }
    }
    public void bark(){
        System.out.println("Woof! ");
    }
    public void wagTail(){
        System.out.println("Dog Wagging ");
    }
    public void run(){
        System.out.println("Dog Running  ");
    }
    public void walk(){
        System.out.println("Tail Walking ");
    }
}
