public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired ;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

//    This method is to see whether the person is retired if the age of the Employee is above 60.
    public void retire(){
        if (getAge() > 60)
            System.out.println(!isRetired);
        else
            System.out.println(isRetired);
    }

//    This is to return the daily Pay of the employee.
    public double collectPay(){
        return annualSalary/26;
    }

    @Override
    public String toString() {

        String x = "SalariedEmployee \n{" +
                "annualSalary=" + annualSalary +
                ", Age = " + getAge() +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                "} " + "\n" + super.toString();

        String y = "SalariedEmployee \n{" +
                "annualSalary=" + annualSalary +
                ", Age = " + getAge() +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", endDate=" + endDate +
                "} " + "\n" + super.toString() ;

        if(endDate == null){
            return x;
        }
        else{
            return y;
        }
    }
}
