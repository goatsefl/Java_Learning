public class Main {
    public static void main(String[] args) {

        Worker Axel = new Worker("AxelSwithern","01/05/1992");
        Axel.Terminate("21/12/2023");
        System.out.println(Axel + "\n");

        Employee gray = new Employee("Sukuna","21/12/1995","12/1/2018");
        System.out.println(gray + "\n");

        SalariedEmployee jake = new SalariedEmployee("Jake","02/03/1999","20/11/2009",150000);
        System.out.println(jake + "\n" );

        HourlyEmployee gazele = new HourlyEmployee("Gazeille","24/06/1993","10/08/2010",16);
        System.out.println(gazele + "\n");

        Employee mujun = new Employee("Mujunna","21/12/1940","12/1/2013");
        mujun.Terminate("11/11/2023");
        System.out.println(mujun + " "+ mujun.getAge() + "" + "\n");

        HourlyEmployee hanzo = new HourlyEmployee("Hanzo Gonzalez","20/11/1994","12/04/2020",12);
        System.out.println(hanzo);

        System.out.println(hanzo.employeeId);

        Employe John = new Employe();
        John.name = "John Doe";
        John.department = "Marketing";
        John.introduce(); // Outputs: My name is John Doe. And I work in the Marketing department.
    }
}

// The usage of this and super is showcased here to understand it in-depth in the challenge.
// The code below uses Bard's generated code and definition for easier definition, which has been cross-checked from my side.
// It's the most important concept in entire of java.

/*
this:

Refers to the current object instance.
Used to access non-static members (fields and methods) within the same class.
Helps avoid ambiguity, especially when method parameters or local variables have the same name as class members.

super:

Refers to the immediate superclass of the current class.
Used to access members (fields and methods) declared in the superclass.
Useful for overriding methods or accessing superclass functionality when needed.*/

class Person {
    String name;

    void introduce() {
        System.out.println("My name is " + name); // Accesses current object's name using "this"
    }
}

class Employe extends Person {
    String department;

    @Override
    void introduce() {
        super.introduce(); // Calls parent class introduce() using "super"
        System.out.println("And I work in the " + department + " department");
    }
}

/*Purpose:

Overloading: Used to provide multiple methods with the same name but different behaviors based on parameter types or numbers.
Overriding: Used to provide a specific implementation of a method in a subclass that is already defined in its superclass.
Inheritance:

Overloading is achieved within the same class or its subclasses.
Overriding occurs between a superclass and its subclass.
Method Signature:

Overloading changes the method signature (parameters).
Overriding keeps the method signature the same, providing a different implementation.*/
