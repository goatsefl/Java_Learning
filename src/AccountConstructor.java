public class AccountConstructor {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    // Constructor ?
    //A constructor in Java is a special method that is called when an object is created. It is used to initialize the object's state.
    //The constructor's name must be the same as the class name. It cannot have a return type, not even void.

    //Empty constructor
    public AccountConstructor() {
        System.out.println("Empty Constructor");
    }

    //Explicit Constructor with Parameters
    public AccountConstructor(String number, double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        email = email;
        phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}