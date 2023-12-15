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
    }
}