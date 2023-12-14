public class HourlyEmployee extends Employee{
    private static double hourlyPayRate = 15;
    private double hours;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hours) {
        super(name, birthDate, hireDate);
        this.hours = hours;
    }
    public double getDoublePay(){
        double d = 0;
        double n = 0;
        if(hours < 9 && hours > 7)
        return n = hours * hourlyPayRate;
        else if(hours > 8)
            d = hours * 2 * hourlyPayRate;
        return d;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", employeeId=" + employeeId +
                ", endDate='" + endDate + '\'' +
                ", pay} " + super.toString();
    }

}
