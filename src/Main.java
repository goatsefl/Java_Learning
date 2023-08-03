public class Main {
    public static void main(String[] args) {
//        AccountConstructor constructor = new AccountConstructor("12221",3500,"Swaroop","Java@swaroop.com","7396456123");
        AccountConstructor constructor = new AccountConstructor();
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

    }
}
