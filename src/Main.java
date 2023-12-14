public class Main {
    public static void main(String[] args) {
//        AccountConstructor constructor = new AccountConstructor("12221",3500,"Swaroop","Java@swaroop.com","7396456123");
       /* AccountConstructor constructor = new AccountConstructor();
        System.out.println(constructor.getNumber());
        System.out.println(constructor.getBalance());
        System.out.println(constructor.getCustomerName());
        System.out.println(constructor.getEmail());

        //Basic Car
        Car cars = new Car();
        cars.setMake("Maruti");
        cars.setModel("Baleno");
        cars.setColor("Green");
        cars.setConvertible(false);
        cars.setDoors(4);
        cars.describeCar();

        // Roofless Car

        Car targa = new Car();
        targa.setMake("Maruti");
        targa.setModel("Jimmy");
        targa.setDoors(4);
        targa.setConvertible(true);
        targa.describeCar();

        //Bank Account Details
        
        Bankaccount ptk = new Bankaccount();
        ptk.setAccbalance(50000.00);
        ptk.withdraw(300.82);
        ptk.deposit(1400.45);
        ptk.setCname("Prateek");
        ptk.setAcname("Prateek Varaganti");
        ptk.setAcnumber("45453");
        ptk.setEmail("ptk.varaganti@gmail.com");
        ptk.setContact("8897007272");
        ptk.describeAcc();

        // Understanding Constructor
        AccountConstructor indi = new AccountConstructor("Sreekar","sreekar@gmail.com","8988289221");

        System.out.println(indi.getEmail() +"\n"+ indi.getCustomerName() +"\n"+ indi.getPhone() +" "+ indi.getNumber());

        // Constructor [Challenge 2]

        //With all Parameters
        Customer id1 = new Customer("Atul VajPayee",50000,"atulpayee@gmail.com");
        System.out.println(id1.getName());
        System.out.println(id1.getCreditLimit());
        System.out.println(id1.getEmail());

        //With 2 parameters
        Customer id2 = new Customer("Swapnil","swapnilshehzada@gmail.com");
        System.out.println(id2.getName());
        System.out.println(id2.getCreditLimit());
        System.out.println(id2.getEmail());

        // With no parameters
        Customer id3 = new Customer();
        System.out.println(id3.getName());
        System.out.println(id3.getCreditLimit());
        System.out.println(id3.getEmail());



        // Pojo Plain Old Java Object

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("91231" + i,
                    switch (i) {
                        case 1 -> "Gurukul";
                        case 2 -> "Ghanshyaam";
                        case 3 -> "Suraj";
                        case 4 -> "Shankar";
                        case 5 -> "Govind";
                        default -> "Anonymous";
                    },
                    "03/02/2002",
                    "Java Mastering");
            System.out.println(s);
        }

        // NewStudent is a record which eliminates boilerplate code unlike POJO

        for (int i = 1; i <= 5; i++) {
            NewStudent s1 = new NewStudent("91231" + i,
                    switch (i) {
                        case 1 -> "Gurukul";
                        case 2 -> "Ghanshyaam";
                        case 3 -> "Suraj";
                        case 4 -> "Shankar";
                        case 5 -> "Govind";
                        default -> "Anonymous";
                    },
                    "03/02/2002",
                    "Java Mastering");
            System.out.println(s1);

        }

        // Comparing POJO and records :

        Student x = new Student("13445","Aditya","01/01/2001","Python MasterClass");
        NewStudent y = new NewStudent("23112","Sanjay","12/12/2000","Data Structures and Algorithms");

        System.out.println(x.getName()+" "+x.getId() +" "+x.getClassList()+" "+x.getDateOfBirth());
        System.out.println(y.id()+" "+y.name()+" "+y.dateOfBirth()+" "+y.classList());

        //Challenge [3]
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        // Coding Practise [4]
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        // Calculator

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);

        floor = new Floor(5.4, 4.5);

        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        // Complex Number Basic Addition & Subtraction;


        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        */

        /* This code below is a challenge based on Complex Number
        * A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
        * and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number.
        * For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers,
        * just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another,
        * the sum of 3 + i and –1 + 2i is 2 + 3i.*/
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println(STR."one.real= \{one.getReal()}");
        System.out.println(STR."one.imaginary= \{one.getImaginary()}");
        one.subtract(number);
        System.out.println(STR."one.real= \{one.getReal()}");
        System.out.println(STR."one.imaginary= \{one.getImaginary()}");
        number.subtract(one);
        System.out.println(STR."number.real= \{number.getReal()}");
        System.out.println(STR."number.imaginary= \{number.getImaginary()}");


    }
}