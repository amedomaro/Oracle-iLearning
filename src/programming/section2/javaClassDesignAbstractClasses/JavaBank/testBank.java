package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public class testBank {

    public static void main(String[] args) {

        // Instantiate 3 accounts
        // Using constructor with values
        Account A1 = new Account("Sanjay Gupta", 11556, 300);
        // Using default constructor
        Account A2 = new Account();
        Account A3 = new Account();

        //Set values of Instances created using default constructor
        A2.setAccountName("He Xai");
        A2.setAccountNum(22338);
        A2.setBalance(500);

        A3.setAccountName("Ilya Mustafana");
        A3.setAccountNum(44559);
        A3.setBalance(1000);

        // Print accounts
        A1.print();
        A2.print();
        A3.print();
    }
}
