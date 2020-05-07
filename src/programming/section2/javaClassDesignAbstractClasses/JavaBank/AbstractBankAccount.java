package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public abstract class AbstractBankAccount {
    protected final String BANK = "JavaBank";

    protected String accountName;
    protected int accountNum;
    protected int balance;

    AbstractBankAccount(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    protected abstract void deposit(int amt);

    protected abstract void withdraw(int amt);

    protected abstract int getBalance();

    protected abstract String getBankName();

}
