package foundations.section7.creatingClass01;

public class AccountTest {

    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(1000, "Aleksandr");
        System.out.println(account.toString());
    }
}
