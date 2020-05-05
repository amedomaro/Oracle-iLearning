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

    // Below getters, setters and override
    protected void setCreditLimit(int num) {
        this.creditLimit = num;
    }

    protected int getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void print() {
        System.out.printf("%-15s ID:%-8d balance:%-8d creditLimit:%d\n", getAccountName(), getAccountNum(),
                getBalance(), creditLimit);
    }
}
