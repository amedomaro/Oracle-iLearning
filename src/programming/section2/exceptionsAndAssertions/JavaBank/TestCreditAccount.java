package programming.section2.exceptionsAndAssertions.JavaBank;

/**
 @author Aleksandr Ilin
 */

public class TestCreditAccount {


    public static void main(String[] args) {
        // Instantiate 3 accounts
        // Using constructor with values
        Account a1 = new Account("Sanjay Gupta", 11556, 300);
        // Using default constructor
        Account a2 = new Account("He Xai",22338,500);
        Account a3 = new Account("Ilya Mustafana",44559,1000);

        // Instantiate 2 credit accounts
        // Using default constructor
        CreditAccount c1 = new CreditAccount("A.N Other", 88776, 500);
        // Using constructor with values which will call constructor from super
        CreditAccount c2 = new CreditAccount("Another", 66778, 1000, 500);

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
        c1.print();
        c2.print();

//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(c1);
//        System.out.println(c2);
    }
}

