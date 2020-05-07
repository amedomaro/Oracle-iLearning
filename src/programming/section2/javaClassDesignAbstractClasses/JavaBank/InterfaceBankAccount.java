package programming.section2.javaClassDesignAbstractClasses.JavaBank;

public interface InterfaceBankAccount {
    String BANK = "JavaBank";

    void deposit(int amt);
    void withdraw(int amt);
    int getBalance();
    String getBankName();
}

