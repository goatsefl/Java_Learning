public class Main {
    public static void main(String[] args) {
        AccountConstructor constructor = new AccountConstructor("12221",3500,"Swaroop","Java@swaroop.com","7396456123");

<<<<<<< HEAD
        System.out.println(constructor.getNumber());
        System.out.println(constructor.getBalance());
        System.out.println(constructor.getCustomerName());
        System.out.println(constructor.getEmail());
  /*      Car cars = new Car();
=======
        //Basic Car
        Car cars = new Car();
>>>>>>> 6c4e5eea1abbf48fd49fc0b5e9d4f30fdd04889e
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

        // Bank Account Details 
        
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


    }
}
