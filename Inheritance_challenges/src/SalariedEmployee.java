public class SalariedEmployee extends Employee{
    private double annualSalary;
    public Worker w;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    public void retire(){
        if (w.getAge() > 60)
            System.out.println(isRetired);
        else
            System.out.println(!isRetired);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", w=" + w +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
