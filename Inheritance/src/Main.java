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