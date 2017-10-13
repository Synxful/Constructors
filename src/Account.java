public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    // constructor - ist dafür da automatisierte vorgänge zu vereinfachen

    // empty constructor
    public Account() {

        this("551234", 2.50, "Default Name", "Default adress", "default phone");
        System.out.println("Empty constructor called.");
    }

    // account constructor
    public Account(String number, double balance, String customerName, String customerEmailAdress, String customerPhoneNumber) {

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAdress, String customerPhoneNumber) {
        this("9345134", 100.55, customerName, customerEmailAdress, customerPhoneNumber);
    }

    /*
    ##################################################################################################################
     */

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }




}
