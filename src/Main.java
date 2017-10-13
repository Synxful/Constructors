public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("52345", 0.00, "Bob Brown", "bobbrown@gmail.com", "0621/62346234" );
//        bobsAccount.setNumber("52367");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAdress("bobbrown@gmail.com");
//        bobsAccount.setCustomerPhoneNumber("0612/2345123");


        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);




        Account timsAccount = new Account("Tim", "tim@gmail.com", "15234");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());




        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());


        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());

    }
}
