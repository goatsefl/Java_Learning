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