package developer.arifkhan;

public class Main {

    public static void main(String[] args) {
//        Account arifsAccount = new Account("12345", 0.00, "md Ariful islam", "arifcse209@gmail.com", "+880176429XXXX");
//        arifsAccount.deposit(50.00);
//        arifsAccount.withdrawl(100.00);
//        arifsAccount.deposit(1000.00);
//        arifsAccount.withdrawl(100.00);
//        System.out.println(arifsAccount.getCustomerName());
//        System.out.println(arifsAccount.getAccountNumber());
//        System.out.println(arifsAccount.getCustomerEmailAddress());
//        System.out.println(arifsAccount.getCustomerPhoneNumber());
//        System.out.println(arifsAccount.getAccountBalance());

//        Account khan = new Account("khan", "majorsigma8@gmail.com", "01764297928");
//        khan.deposit(1000.00);
//        khan.withdrawl(500.00);
//
//        System.out.println(khan.getCustomerName());
//        System.out.println(khan.getAccountNumber());
//        System.out.println(khan.getCustomerEmailAddress());
//        System.out.println(khan.getCustomerPhoneNumber());
//        System.out.println(khan.getAccountBalance());


        vipPerson person1=new vipPerson("arif",500.00,"arifcse209@gmail.com");
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());
        System.out.println(person1.getName());

    }
}
