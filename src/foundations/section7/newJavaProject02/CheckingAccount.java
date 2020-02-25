package foundations.section7.newJavaProject02;

public class CheckingAccount {

    private double balance;
    private String name;

    protected CheckingAccount(int balance, String name){
        setBalance(balance);
        setName(name);
    }

    protected void withdraw(double num){
        if(num > 0){

            if (getBalance() - num >= 0){
                setBalance(balance - num);
                System.out.printf("Successfully.\nYour new balance: %.2f\n", getBalance());
            }else {
                System.out.printf("Your balance is too small to withdraw: %.2f\n", num);
            }

        } else {
            System.out.println("The number is entered incorrectly, the number must be positive");
        }
    }

    protected double getBalance(){
        return balance;
    }

    private void setBalance(double balance){
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
