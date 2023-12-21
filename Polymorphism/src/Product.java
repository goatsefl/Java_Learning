public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;
    /*  Composition is HAS A relation, In this example we will look into how it is different
     from basic Inheritance and the differences between them.
    */
    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
