package foundations.section7.newJavaProject02;

public class AccountTest {

    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(1000, "Aleksandr");
        System.out.println(account.toString());

        System.out.println("---------------------------------------------------------------");
        account.withdraw(-1001);

        System.out.println("---------------------------------------------------------------");
        account.withdraw(560.4);
    }
}
