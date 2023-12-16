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
        this("12344",3244,"Sriram","sriram@gmail.com","8790989892");
        System.out.println("Empty Constructor");
    }
    /* This is a chained constructor, and it has to be specified in the starting of the constructor */

    public AccountConstructor(String customerName, String email, String phone) {
        this("9909",3999,customerName,email,phone);
//        this.customerName = customerName;
//        this.email = email;
//        this.phone = phone;
    }

    //Explicit Constructor with Parameters
    public AccountConstructor(String number, double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
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
