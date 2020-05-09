package programming.section3.generics.JavaBank;

public class Account extends AbstractBankAccount {

//    private String accountName;
//    private int accountNum, balance;

    private int bonusValue;

    Account(String name, int num, int amt) {
        super(name, num, (amt + calculateInitialBonusValue(amt)));
    }

    private static int calculateInitialBonusValue(int amt) {
        return (amt >= 1 && amt <= 100) ? 10 : (amt <= 300) ? 20 : 30;
    }

    @Override
    public String getBankName() {
        return BANK;
    }

    //make a deposit to the balance
    protected void deposit(int amt) {
        balance += (amt > 100) ? (amt + (int) (bonusValue * 0.1)) : amt;
    }

    //make a withdrawal from the balance
    protected void withdraw(int amt) {
        balance -= amt;
    }

    //print method
    protected void print() {
        System.out.printf("| %-15s | ID: %-8d | balance: %-8d|\t\t\t\t\t\t|\n", accountName, accountNum, balance);
        System.out.println("-----------------------------------------------------------------------------");
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
