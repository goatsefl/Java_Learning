public class SBuilder {
    public static void main(String[] args){
//      String:

//      The difference is how it stores inside the memory for String,
//      The moment a literal is created by a string, it creates a new object, but the reference of
//      new_string is pointing to Hello New String because it was not assigned to a variable

        /*----------------------------------------------------------------------------------------------------------------------*/
//      StringBuilder:

//      Whereas, the object created by StringBuilder will point to the recently manipulated object.
//      Making StringBuilder efficient in terms of memory management and faster to access.
//      new_stringB is pointing to the recent method which was applied because it was an object that has a self-reference.
//      Default capacity of StringBuilder is around 16 character length but, it can be changed by increasing it using an int value.

        StringBuilder new_stringB = new StringBuilder(" Hello " + " New " + " String ");

//        String new_string = new_stringB; This will not work as both are of different type.
//        The main difference between StringBuilder and String is Mutability, which String lacks
        String new_string = " Hello New String";

        new_stringB.append(" Mutable");
        new_string.concat("Immutable");

        System.out.println(new_stringB);// Prints Hello New String Mutable.
        System.out.println(new_string); // Prints Hello New String.

        new_stringB.deleteCharAt(9).insert(9,"st");
        new_stringB.append("\nThis will repeat for 5 times".repeat(5));
        System.out.println("Adding 3 operations in one line for the stringB = " + new_stringB);

        StringBuilder capacity = new StringBuilder();
        StringBuilder capacity64 = new StringBuilder(64);

        capacity.append("A".repeat(57));
        capacity64.append("B".repeat(57));

        System.out.println(capacity64 + "\n" + capacity);

//      In some systems, the default capacity is 16, my system keeps the default as 32.



    }
}

/*OUTPUT:
* */