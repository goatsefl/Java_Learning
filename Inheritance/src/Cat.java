/*This Cat class was made to show how the Static and Instance variables differ*/
public class Cat {
    private static String name;
    private int age;
    public Cat(String name, int age){
        Cat.name = name;
        this.age = age;
    }

    public void printName(){
        System.out.println(STR."Name= \{name}");
        System.out.println(STR."Age = \{age}");
    }

}
