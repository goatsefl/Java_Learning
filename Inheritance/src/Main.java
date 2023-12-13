public class Main {
    public static void main(String[] args) {
        // What is a Class Diagram?
        // It's a way to showcase the list of attributes and behaviours a class exhibits.
        // Example :
        /*                CLASS
        |------------------Animal-------------------------|
        |-----Attributes----------------------------------|
        |* Legs                                           |
        |* Type                                           |
        |* Weight                                         |
        |* Height                                         |
        |* Gender                                         |
        |-----Behaviour-----------------------------------|
        |* Speed                                          |
        |* Bark                                           |
        |_________________________________________________|
        */

        // Lazy Commit for the sake of streak
        Animal animal = new Animal("Generic","small",344.42);
        doAnimalStuff(animal,"slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        Dog yorkie = new Dog("Yorkie",15);
        Dog retriever = new Dog("Labrador Retriever",65,"floppy","Swimmer");
        doAnimalStuff(yorkie,"fast");
        doAnimalStuff(retriever,"slow");




        /*This is a SimpleCalculator Challenge for usage of getters and setters, also the usage of "this"*/

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println(STR."add= \{calculator.getAdditionResult()}");
        System.out.println(STR."subtract= \{calculator.getSubtractionResult()}");
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println(STR."multiply= \{calculator.getMultiplicationResult()}");
        System.out.println(STR."divide= \{calculator.getDivisionResult()}");


        /*This is a Constructor challenge which challenges on chaining of constructors and how they can be useful using 3 customers as an example.*/

        Customer cus1 = new Customer();
        System.out.println(cus1.getName());
        System.out.println(cus1.getEmailAddress());
        System.out.println(cus1.getCreditLimit());
        Customer cus2 = new Customer("Joey","gobbel@gmail.com");
        System.out.println(cus2.getName());
        System.out.println(cus2.getEmailAddress());
        System.out.println(cus2.getCreditLimit());
        Customer cus3 = new Customer("Sindhu","snigdha@gmail.com",3500);
        System.out.println(cus3.getName());
        System.out.println(cus3.getEmailAddress());
        System.out.println(cus3.getCreditLimit());
    }
    // This is a function inside the Main.java used for demonstration purposes on Inheritance.
    // The below method improves the re-usability of code, which is an advantage with Inheritance.
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}