public class Car {
    private String make = "Tata";
    private String model = "Nexon";
    private String color = "Blue";
    private int doors = 4;
    private boolean convertible = false;

/*
Getter and setter methods are special methods in object-oriented programming
that are used to access and modify the properties of an object. 
Getter methods are used to retrieve the value of a property, 
while setter methods are used to set the value of a property.
*/

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make){
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "maruti", "tata", "mahindra" -> this.make = make;
            default -> this.make = "Unsupported ";

        }

    }

    public void describeCar(){
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible": ""));
    }
}
