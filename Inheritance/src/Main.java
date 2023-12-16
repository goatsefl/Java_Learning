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


        /*This is a Constructor challenge which challenges on chaining constructors and how they can be useful,by using 3 customers as an example.*/

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

        /*This part of block is used for Cat class which describes Static and instance variables*/
        Cat a = new Cat("Mew",23);
        Cat b = new Cat("Piku",34);

        b.printName();// This will also print Piku as Cat b = new Cat("Piku") is initialized later than Cat "a". Will print the right age for b.
        a.printName(); // This will be printed Piku, as it is a static variable that is storing the name will print the right age for a.
        System.out.println("\n\n");
        /*The below Example will give better Idea of static and instance variables
        (Also, Class name is considered good practise for static variables instead of reference variables)*/
        Cat c = new Cat("Ambi",25);
        c.printName(); // This will print Ambi
        Cat d = new Cat("Janaki",23);
        d.printName(); // This will print Janaki

//        Fish object which is child class of Animal.java

        Fish gold = new Fish("goldfish",1,3,4);

        doAnimalStuff(gold,"medium");

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