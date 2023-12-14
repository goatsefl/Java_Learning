public class Main {
    public static void main(String[] args) {

        Worker Axel = new Worker("AxelSwithern","01/05/1992");
        System.out.println(Axel);

        Employee gray = new Employee("Sukuna","21/12/1995","12/1/2018");
        System.out.println(gray);

        SalariedEmployee jake = new SalariedEmployee("Jake","02/03/1999","20/11/2009",150000);
        System.out.println(jake);

        HourlyEmployee gazele = new HourlyEmployee("Gazeille","24/06/1993","10/08/2010",16);
        System.out.println(gazele);
    }
}