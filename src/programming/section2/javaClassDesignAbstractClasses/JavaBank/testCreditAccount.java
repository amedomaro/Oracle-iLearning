package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public class testCreditAccount {


    public static void main(String[] args) {

        // Instantiate 3 accounts
        // Using constructor with values
        Account A1 = new Account("Sanjay Gupta", 11556, 300);
        // Using default constructor
        Account A2 = new Account();
        Account A3 = new Account();

        // Instantiate 2 credit accounts
        // Using default constructor
        Account C1 = new CreditAccount();
        // Using constructor with values which will call constructor from super
        Account C2 = new CreditAccount("Another", 66778, 1000, 500);

        //Set values of Instances created using default constructor
        A2.setAccountName("He Xai");
        A2.setAccountNum(22338);
        A2.setBalance(500);

        A3.setAccountName("Ilya Mustafana");
        A3.setAccountNum(44559);
        A3.setBalance(1000);

        C1.setAccountName("A.N Other");
        C1.setAccountNum(88776);
        C1.setBalance(500);

        // Print accounts
        A1.print();
        A2.print();
        A3.print();
        C1.print();
        C2.print();
    }
}

