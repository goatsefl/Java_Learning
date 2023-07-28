public class Bankaccount {

    private String acnumber = "13454";

    private String acname = "Ch.S.Swaroop";

    private String cname = "Swaroop";

    private String email = "swaroop.shruti123@gmail.com";

    private String contact = "7396973313";

    private double accbalance = 2758.94;

    public double getAccbalance() {
        return accbalance;
    }

    public String getAcnumber() {
        return acnumber;
    }
    public String getCname() {
        return cname;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getAcname() {
        return acname;
    }

    public void setAccbalance(double accbalance) {
        this.accbalance = accbalance;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        if(contact.length() == 10)
        this.contact = contact;
        else{
            System.out.println("Not a valid contact number");
        }
    }

    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber;
    }

    public void describeAcc() {
        System.out.println("- Account Number:" + acnumber + "\n" +
                "- Account Name: " + acname + "\n" +
                "- Customer Name: " + cname + "\n" +
                "- Email: " + email + "\n" +
                "- Contact Number: " + contact + "\n" +
                "- Account Balance: " + accbalance  );
    }

    public void withdraw(double withdraw) {
        if (accbalance <= 100)
            System.out.println("Not enough funds to withdraw");
        else if (accbalance >= 100) {
            accbalance -= withdraw;
            System.out.println("Your current withdrawal amount: " + withdraw);
        }
    }
        public void deposit(double deposit){
        if(deposit < 500){
            System.out.println("Deposit Minimum limit is 500");
        }
        else if(deposit >=500 ){
            accbalance += deposit;
        }
        System.out.println("Amount deposited : " + deposit);
    }
}
