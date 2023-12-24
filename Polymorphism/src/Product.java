package Polymorphism.src;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    /*
    The Product class defines basic product attributes: model, manufacturer, width, height, and depth.
    It features a constructor to initialize model and manufacturer.
    The toString() method provides a string representation of the product's model and manufacturer.
    */


    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
