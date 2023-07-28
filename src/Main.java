public class Main {
    public static void main(String[] args) {

  /*      Car cars = new Car();
        cars.setMake("Maruti");
        cars.setModel("Baleno");
        cars.setColor("Green");
        cars.setConvertible(false);
        cars.setDoors(4);
        cars.describeCar();

        // New roofless car

        Car targa = new Car();
        targa.setMake("Maruti");
        targa.setModel("Jimmy");
        targa.setDoors(4);
        targa.setConvertible(true);
        targa.describeCar();
*/
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