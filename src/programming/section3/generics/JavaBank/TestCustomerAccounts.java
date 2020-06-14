package programming.section3.generics.JavaBank;

/**
 @author Aleksandr Ilin
 */

public class TestCustomerAccounts {

    public static void main(String[] args) {

        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        // Instantiate 2 credit accounts using constructor with
        bankAccount[0] = new Account("Sanjay Gupta", 11556, 300, AccountType.SAVINGS);
        bankAccount[1] = new Account("He Xai", 22338, 500, AccountType.SAVINGS);
        bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000, AccountType.SAVINGS);

        // Instantiate 2 credit accounts using constructor with
        bankAccount[3] = new CreditAccount("A.N Other", 88776, 500);
        bankAccount[4] = new CreditAccount("Another", 66778, 1000, 500);

        showAllCustomerAccounts(bankAccount);
        showAllAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
        System.out.print("\nAll Customer Accounts\n-------------------------------\n");

        for (AbstractBankAccount act : bankAccount) {
            System.out.println(act);
        }
    } //end method showAllCustomerAccounts

    public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
        System.out.print("\nAll Account types\n-------------------------------\n");

        for (AbstractBankAccount act : bankAccount)
            if (act instanceof Account) {
                System.out.println(act);
            }
    }//end method getAllAccounts

    public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount) {
        System.out.print("\nAll Credit Account types\n-------------------------------\n");
        for (AbstractBankAccount act : bankAccount)
            if (act instanceof CreditAccount) {
                System.out.println(act);
            }
    }//end method getAllCreditAccounts
}
