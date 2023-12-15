public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate){
        this.birthDate = birthDate;
        this.name = name;

    }
    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0;
    }
    public void Terminate(String endDate){

        if(getAge() > 60){
            this.endDate = "2023";
        }
        else{
            this.endDate = endDate;
        }
    }

    @Override
    public String toString() {

        String x = "Worker \n{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate  +
                '}' + '\n';
        String y = "Worker \n{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}'+ '\n';
        if(endDate == null){
            return x;
        }
        else{
            return y;
        }
    }
}
