package programming.section3.generics.JavaBank;

public abstract class AbstractBankAccount {
    protected final String BANK = "JavaBank";

    private String accountName;
    private int accountNum;
    protected int balance;

    AbstractBankAccount(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    protected abstract void deposit(int amt);

    protected abstract void withdraw(int amt);


    protected int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    protected String getAccountName() {
        return accountName;
    }

    protected void setAccountName(String accountName){
        this.accountName = accountName;
    }

    protected int getAccountNum() {
        return accountNum;
    }

    protected void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    protected String getBankName() {
        return BANK;
    }

    @Override
    public String toString() {
        return String.format("%-15s ID: %-8d balance: %-8d", accountName, accountNum, balance);
    }

}
