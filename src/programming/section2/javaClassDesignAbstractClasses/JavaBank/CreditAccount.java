package programming.section2.javaClassDesignAbstractClasses.JavaBank;

/**
 @author Aleksandr Ilin
 */

public class CreditAccount extends AbstractBankAccount {

    private int creditLimit;

    CreditAccount(String name, int num, int amt){
        super(name, num, amt);
        this.creditLimit = calculateCreditLimit(amt);
    }

    CreditAccount(String name, int num, int amt, int credit) {
        super(name, num, amt);
        this.creditLimit = credit;
    } // end constructor

    public void print() {
        System.out.printf("| %-15s | ID: %-8d | balance: %-8d| creditLimit: %-9d|\n", accountName, accountNum,
                getBalance(), creditLimit);
        System.out.println("-----------------------------------------------------------------------------");
    }

    private static int calculateCreditLimit(int amt){
        return (amt >= 1 && amt <= 2000) ? 100 : (amt <= 4000) ? 200 : 300;
    }

    // Below getters, setters and override
    protected void setCreditLimit(int num) {
        this.creditLimit = num;
    }

    protected int getCreditLimit() {
        return creditLimit;
    }

    @Override
    protected void deposit(int amt) {
        balance += amt;
    }

    @Override
    protected void withdraw(int amt) {

    }

    @Override
    protected int getBalance() {
        return balance;
    }

    @Override
    protected String getBankName() {
        return BANK;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Credit Limit : %d", creditLimit);
    }
}
