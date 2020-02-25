package foundations.section7.newJavaProject;

public class CheckingAccount {

    private double balance;
    private String name;

    protected CheckingAccount(int balance, String name){
        setBalance(balance);
        setName(name);
    }

    protected double getBalance(){
        return balance;
    }

    private void setBalance(int balance){
        this.balance = balance;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Name = %s, balance = %.2f", getName(), getBalance());
    }
}
