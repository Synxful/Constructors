public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;


    public VipCustomer(){
        this("Default Name", 50000.00, "Default Email");
    }

    public VipCustomer(String name, double creditLimit) {
//        this.name = name;
//        this.creditLimit = creditLimit;
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    /*
    ##########################################################################################
     */

    // getter


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
