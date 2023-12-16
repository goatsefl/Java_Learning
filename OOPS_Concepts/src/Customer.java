public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, String email) {
        this(name,100000,email);
    }

    public Customer() {
        this("Swaroop","swaroopd502@gmail.com");
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName(){
        return name;
    }
}
