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

//            New printer P1
        Printer p1 = new Printer(50,true);
        System.out.println(p1);
        p1.printPages(77);
        System.out.println(p1);
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