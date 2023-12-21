public class Monitor extends Product{

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
    public void drawPixelAt(int x , int y, String color){

    }
}
