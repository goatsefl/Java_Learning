public class Employee extends Worker {
    public long employeeId;
    private String hireDate;

    private static int employee = 1;
    public Employee(String name, String birthDate,String hireDate){
        super(name,birthDate);
        this.employeeId= Employee.employee++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
