public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 14);
        System.out.println(max.toString());
    }

    class Student{
        private int age;
        private String name;
        Student(int age, String name){
            this.age = age;
            this.name = name;
        }

        public String toString(){
            return super.toString();
        }
    }
}