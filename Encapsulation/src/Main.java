public class Main {
    public static void main(String[] args) {
/*
Encapsulation in OOP is bundling data and methods within a class,
hiding internal details, and exposing a controlled interface for interaction.

This class is not encapsulated where anyone can access any field, which can give rise to many problems.

        Player player = new Player();
        player.name = "Krishna";
        player.health = 50;
        player.loseHealth(80);
*/
/*The Class below is entirely encapsulated with private fields.*/

        EnhancedPlayer chinder = new EnhancedPlayer("chinder");

        chinder.healthRemaining();
        chinder.restoreHealth(30);
        chinder.loseHealth(20);
        chinder.loseHealth(30);

        System.out.println(chinder);

/*
Challenge : Encapsulation

In this exercise you will create one class and name it Printer. This class will have two member variables of type int, tonerLevel and pagesPrinted, and one of type boolean called duplex. All three fields will have private access. The constructor will accept two of these variables, tonerLevel and duplex, as parameters following these rules:

    tonerLevel must be greater than -1 but less than or equal to 100. If it does not meet these conditions then it should be initialized to -1.
    duplex should be initialized to the value of the parameter.
    In addition, pagesPrinted should be initialized to 0.

Three other methods need to be defined in this way:

    addToner will accept one parameter, tonerAmount of type int. First off, tonerAmount should be greater than 0 and less than or equal to 100. If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount is greater than 100. If so, the method should return -1. If not then tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should then be returned by the method. Also, if the initial condition test fails, then the method should return -1.

    printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created and initialized to the value of the incoming parameter.   A conditional check should be performed on whether the Printer class field, duplex, is either "true" or "false". If "true" then a calculation must be performed to determine the number of pages needed to print the job double sided. The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint should be returned by the method.

    getPagesPrinted has no parameters and merely returns the value of the member variable pagesPrinted.

*/
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
















/*
    Core Principles of Encapsulation in Object-Oriented Programming:

1. Bundling of Data and Methods:

   Encapsulation involves combining data (attributes) and the methods that operate on that data within a single unit, typically a class. This creates a cohesive structure where data and its associated behavior are closely tied together.

2. Information Hiding:

   Encapsulation restricts direct access to the internal data of an object from outside code. This is achieved by using access modifiers like private or protected to control visibility. Only the object's own methods can directly manipulate its internal data.

3. Public Interface:

   The object exposes a public interface, consisting of methods that other parts of the program can use to interact with it. These methods serve as a controlled way to access and modify the object's state, preserving its integrity.

4. Controlled Access:

   Encapsulation provides mechanisms to control how data is accessed and modified:

   - Getters (Accessors): Methods that allow reading the values of internal data members.
   - Setters (Mutators): Methods that allow modifying the values of internal data members, often with validation or constraints.

Benefits of Encapsulation:

- Modularity: Encourages the creation of self-contained, reusable components.
- Data Integrity: Protects data from accidental corruption or misuse.
- Flexibility: Allows internal implementation changes without affecting external code.
- Maintainability: Improves code readability and reduces complexity.
- Testability: Facilitates testing of individual components in isolation.
- Security: Can enhance security by limiting exposure of sensitive data.

Key Points:

- Encapsulation is a fundamental principle of object-oriented programming, promoting better code organization, maintainability, and flexibility.
- It's essential for designing robust and scalable software systems.

*/








}