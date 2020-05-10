package programming.section3.collections1.JavaBank;

public class Account extends AbstractBankAccount {

//    private String accountName;
//    private int accountNum, balance;

    private int bonusValue;
    private AccountType type;

    Account(String name, int num, int amt, AccountType type) {
        super(name, num, (amt + calculateInitialBonusValue(amt)));
        this.type = type;
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
        System.out.printf("| %-15s | ID: %-8d | balance: %-8d|\t\t\t\t\t\t|\n", getAccountName(), getAccountNum(), balance);
        System.out.println("-----------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + "AccountType : " + this.type;
    }
}
