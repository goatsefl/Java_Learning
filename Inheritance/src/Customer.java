//This is a challenge for constructor

/*Create a new class called Customer, with 3 fields
* name
* creditLimit
* emailAddress
2. Create the getter methods only, for each field. You don't need to create the setters.
3. Create 3 constructors for this class
* Create constructor for all 3 fields which should assign the arguments directly to the instance fields.
* Create constructors with no arguments that calls another constructor, passing literal values for each argument.
* Create constructor which takes email and name parameters which calls another constructor. */
public class Customer {

    private String name;
    private String emailAddress;
    private double creditLimit;
    public Customer(){
        this("Please_Specify_Name","writeyouremailid@preferredmail.com");
    }
//    Constructor is chained where if no args are provided ^ this will be printed with 1000 as the default creditLimit.
    public Customer(String name, String emailAddress){
        this(name,emailAddress,1000);
    }
//    If there are 2 parameters given then ^ this constructor is called with 1000 as the default value.
//    The constructor on line 26 will be called if all the arguments are passed when created a new customer object.
    public Customer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
