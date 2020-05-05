package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public class Account {

    // class variables
    private String accountName;
    private int accountNum, balance;

    //default constructor for Account
    Account() {
        this.accountName = "EMPTY";
        this.accountNum = 0;
        this.balance = 0;
    }

    //overloaded constructor for Account
    Account(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    //make a deposit to the balance
    protected void deposit(int amt) {
        balance += amt;
    }

    //make a withdrawal from the balance
    protected void withdraw(int amt) {
        balance -= amt;
    }

    //print method
    protected void print() {
        System.out.printf("%-15s ID:%-8d balance:%-8d\n", accountName, accountNum, balance);
    }

    // Below getters and setters
    protected void setAccountName(String name) {
        this.accountName = name;
    }

    protected void setAccountNum(int num) {
        this.accountNum = num;
    }

    protected void setBalance(int num) {
        this.balance = num;
    }

    protected String getAccountName() {
        return accountName;
    }

    protected int getAccountNum() {
        return accountNum;
    }

    protected int getBalance() {
        return balance;
    }
}
