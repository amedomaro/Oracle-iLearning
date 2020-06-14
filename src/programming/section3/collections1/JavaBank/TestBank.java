package programming.section3.collections1.JavaBank;

/**
 @author Aleksandr Ilin
 */

public class TestBank {

    public static void main(String[] args) {

        // Instantiate 3 accounts
        Account a1 = new Account("Sanjay Gupta", 11556, 300, AccountType.SAVINGS);
        Account a2 = new Account("He Xai",22338,500, AccountType.SAVINGS);
        Account a3 = new Account("Ilya Mustafana",44559,1000, AccountType.SAVINGS);

        //Set values of Instances created using default constructor
        a2.setAccountName("He Xai");
        a2.setAccountNum(22338);
        a2.setBalance(500);

        a3.setAccountName("Ilya Mustafana");
        a3.setAccountNum(44559);
        a3.setBalance(1000);

        // Print accounts
        a1.print();
        a2.print();
        a3.print();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
