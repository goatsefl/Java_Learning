public class Mains {
    public static void main(String[] args) {
        Students max = new Students("Max", 14);
        System.out.println(max.toString());
        PrimarySchool joey = new PrimarySchool("joey",13,"Chloe");
        System.out.println(joey);
    }
}

// We can modify the sub-class using not only super.toString() but augmenting new string literal values.
class Students{
    private int age;
    private String name;
    Students(String name,int age){
        this.age = age;
        this.name = name;
    }
//    This is just to show the implicit usage of toString()
    /* public String toString(){
        return super.toString();}
    */

//    Explicit usage of toString() that can be modified.
    public String toString(){
        return this.name + " is " + this.age;
    }
}

class PrimarySchool extends Students{
    private String parentName;
    PrimarySchool(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }
//    The super.toString of PrimarySchool class refers to Students class which is "this.name + " is " + this.age".
    public String toString(){
        return this.parentName + "'s kid " + super.toString();
    }
}
