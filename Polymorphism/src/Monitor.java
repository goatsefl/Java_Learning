package Polymorphism.src;

public class Monitor extends PersonalComputer{

    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Monitor(String model, String manufacturer,String resolution,int size) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", resolution='" + resolution + '\'' +
                "} " + super.toString()+ "\n";
    }

    public void drawPixelAt(int x , int y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s",x,y,color));
    }
}
