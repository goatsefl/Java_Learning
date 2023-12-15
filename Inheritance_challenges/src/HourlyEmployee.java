public class HourlyEmployee extends Employee{
    private static double hourlyPayRate = 15;
    private double hours;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hours) {
        super(name, birthDate, hireDate);
        this.hours = hours;
    }
    public double getDoublePay(){

        if(hours == 8){
            return hours * hourlyPayRate;}
        else if (hours > 8){
            return hours * 2 * hourlyPayRate;}
        else if (hours < 8 && hours >0) {
            return 1 * hours * hourlyPayRate;
        }
        else{
            return 0;
        }
    }
    // Customized toString() for better understanding of details for Hourly Employees with super class fields.
    @Override
    public String toString() {
        if (hours > 8)
            return "HourlyEmployee \n{" +
                    "hours=" + (int)hours +
                    ", employeeId=" + employeeId +
                    ", HourlyPay=" + (int)hourlyPayRate +
                    ", pay=" + (int)getDoublePay() +
                    "} " +  "\n";
        else {
            return "HourlyEmployee \n{" +
                    "hours=" + (int)hours +
                    ", employeeId=" + employeeId +
                    ", HourlyPay=" + (int)hourlyPayRate +
                    ", pay=" + (int)getDoublePay() +
                    "} " + "\n";
            }
        }
    }
