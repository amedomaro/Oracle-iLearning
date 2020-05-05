package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public class CreditAccount extends Account {

    private int creditLimit;

    //default constructor for CreditAccount
    CreditAccount() {
        super();
        this.creditLimit = 100;
    }

    //overloaded constructor for CreditAccount
    CreditAccount(String name, int num, int amt, int credit) {
        super(name, num, amt);
        this.creditLimit = credit;
    }

    //modifier to set the account creditlimit
    public void setCreditLimit(int num) {
        creditLimit = num;
    }

    //accessor to get the account creditlimit
    public int getCreditLimit() {
        return creditLimit;
    }

    //print method
    public void print() {
        System.out.printf("%s %d %d %d\n", getAccountName(), getAccountNum(), getBalance(), creditLimit);
    }
}
