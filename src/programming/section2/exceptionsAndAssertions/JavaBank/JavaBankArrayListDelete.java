package programming.section2.exceptionsAndAssertions.JavaBank;

/**
 @author Aleksandr Ilin
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;


public class JavaBankArrayListDelete extends JFrame {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    private String name;

    private JTextField NameJTextField;
    private JTextField AccountNumJTextField;
    private JTextField BalanceJTextField;
    private JTextField DepositJTextField;
    private JTextField WithdrawJTextField;
    private static JTextArea displayJTextArea;

    //  array to store Account details and an ArrayList
    ArrayList<Account> Accounts = new ArrayList<>();
    //static int noAccounts = 0;
    // constructor

    public JavaBankArrayListDelete() {
        //create the interface and start the application
        createUserInterface();
    }

    // create and position GUI components; register event handlers
    private void createUserInterface() {
        // get content pane for attaching GUI components
        Container contentPane = getContentPane();

        // enable explicit positioning of GUI components
        contentPane.setLayout(null);

        // set up inputDetailJPanel
        // JPanel for user inputs
        JPanel inputDetailJPanel = new JPanel();
        inputDetailJPanel.setBounds(16, 16, 208, 250);
        inputDetailJPanel.setBorder(new TitledBorder("Input Details"));
        inputDetailJPanel.setLayout(null);
        contentPane.add(inputDetailJPanel);

        // set up NameJLabel
        // JLabel and JTextField for account name
        JLabel nameJLabel = new JLabel();
        nameJLabel.setBounds(8, 32, 90, 23);
        nameJLabel.setText("Name:");
        inputDetailJPanel.add(nameJLabel);

        // set up NameJTextField
        NameJTextField = new JTextField();
        NameJTextField.setBounds(112, 32, 80, 21);
        NameJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(NameJTextField);

        // set up AccountNumJLabel
        // JLabel and JTextField for account number
        JLabel accountNumJLabel = new JLabel();
        accountNumJLabel.setBounds(8, 56, 100, 23);
        accountNumJLabel.setText("Account Number:");
        inputDetailJPanel.add(accountNumJLabel);

        // set up AccountNumTextField
        AccountNumJTextField = new JTextField();
        AccountNumJTextField.setBounds(112, 56, 80, 21);
        AccountNumJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(AccountNumJTextField);

        // set up BalanceJLabel
        // JLabel and JTextField for balance
        JLabel balanceJLabel = new JLabel();
        balanceJLabel.setBounds(8, 80, 60, 23);
        balanceJLabel.setText("Balance:");
        inputDetailJPanel.add(balanceJLabel);

        // set up BalanceTextField
        BalanceJTextField = new JTextField();
        BalanceJTextField.setBounds(112, 80, 80, 21);
        BalanceJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(BalanceJTextField);

        // set up DepositJLabel
        // JLabel and JTextField for withdraw
        JLabel depositJLabel = new JLabel();
        depositJLabel.setBounds(8, 104, 80, 23);
        depositJLabel.setText("Deposit:");
        inputDetailJPanel.add(depositJLabel);

        // set up DepositJTextField
        DepositJTextField = new JTextField();
        DepositJTextField.setBounds(112, 104, 80, 21);
        DepositJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(DepositJTextField);

        // set up WithdrawJLabel
        // JLabel and JTextField for Withdraw
        JLabel withdrawJLabel = new JLabel();
        withdrawJLabel.setBounds(8, 128, 60, 23);
        withdrawJLabel.setText("Withdraw:");
        inputDetailJPanel.add(withdrawJLabel);

        // set up WithdrawJTextField
        WithdrawJTextField = new JTextField();
        WithdrawJTextField.setBounds(112, 128, 80, 21);
        WithdrawJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(WithdrawJTextField);

        // set up CreateAccountButton
        // JButton to create account
        JButton createAccountJButton = new JButton();
        createAccountJButton.setBounds(112, 152, 80, 24);
        createAccountJButton.setText("Create");
        inputDetailJPanel.add(createAccountJButton);
        // event handler called when CreateAccountJButton
        // is clicked
        createAccountJButton.addActionListener(event -> CreateAccountJButtonActionPerformed(event));
        // end call to addActionListener

        // set up DeleteAccountButton
        // JButton to delete account
        JButton deleteAccountJButton = new JButton();
        deleteAccountJButton.setBounds(16, 152, 80, 24);
        deleteAccountJButton.setText("Delete");
        inputDetailJPanel.add(deleteAccountJButton);
        // anonymous inner class
        // event handler called when DeleteAccountJButton
        // is clicked
        deleteAccountJButton.addActionListener(event -> DeleteAccountJButtonActionPerformed(event));
        // end call to addActionListener

        // set up TransactionJButton
        // JButton to make transaction
        JButton transactionJButton = new JButton();
        transactionJButton.setBounds(16, 180, 176, 24);
        transactionJButton.setText("Make Transaction");
        inputDetailJPanel.add(transactionJButton);
        // anonymous inner class
        // event handler called when TransactionJButton
        // is clicked
        transactionJButton.addActionListener(event -> TransactionJButtonActionPerformed(event));
        // end call to addActionListener

        // set up DisplayJButton
        // JButton to display account
        JButton displayJButton = new JButton();
        displayJButton.setBounds(16, 208, 176, 24);
        displayJButton.setText("Display Accounts");
        inputDetailJPanel.add(displayJButton);
        // anonymous inner class
        // event handler called when TransactionJButton
        // is clicked
        displayJButton.addActionListener(event -> DisplayJButtonActionPerformed(event));
        // end call to addActionListener

        // set up displayJLabel
        // JLabel and JTextArea to display account details
        JLabel displayJLabel = new JLabel();
        displayJLabel.setBounds(240, 16, 150, 23);
        displayJLabel.setText("Account Details:");
        contentPane.add(displayJLabel);

        // set up displayJTextArea
        displayJTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayJTextArea);
        scrollPane.setBounds(240, 48, 402, 184);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        contentPane.add(scrollPane);
        displayJTextArea.setText("Welcome to Java Bank - There are currently no Accounts created");

        // clear other JTextFields for new data
        NameJTextField.setText("");
        AccountNumJTextField.setText("0");
        BalanceJTextField.setText("0");
        DepositJTextField.setText("0");
        WithdrawJTextField.setText("0");

        // set properties of application's window
        setTitle("Java Bank"); // set title bar string
        setSize(670, 308); // set window size
        setVisible(true); // display window
    } // end method createUserInterface

    private void CreateAccountJButtonActionPerformed(ActionEvent event) {
        // System.out.println("Create Account Button Clicked");
        displayJTextArea.setText("");

        name = "";

        //Get Name from Text Field
        name = NameJTextField.getText();

        //Get AccountNum from Text Field and convert to int unless blank then set to 0
        int accountNum;

        if (AccountNumJTextField.getText().equals("0")) {
            accountNum = 0;
        } else {
            accountNum = Integer.parseInt(NumberCheck.getNumber(AccountNumJTextField.getText()));
        }

        //Get Balance from Text Field and convert to int unless blank then set to 0
        int balance;

        if (BalanceJTextField.getText().equals("0")) {
            balance = 0;
        } else {
            balance = Integer.parseInt(NumberCheck.getNumber(BalanceJTextField.getText()));
        }

        if ((!name.equals("")) & (accountNum != 0)) {
            //add a new account to the list using the Account constructor
            Accounts.add(new Account(name, accountNum, balance));
            //Set a temp Account for display purposes
            Account tempAccount = Accounts.get(Accounts.size() - 1);
            //Display tempAccount
            displayJTextArea.setText(Accounts.size() + " " + tempAccount.getAccountName() + " "
                    + tempAccount.getAccountNum() + " " + tempAccount.getBalance());

        } else {
            displayJTextArea.setText("Both the Name field and Account Number must be completed");
        }

        // clear other JTextFields for new data
        NameJTextField.setText("");
        AccountNumJTextField.setText("0");
        BalanceJTextField.setText("0");
        DepositJTextField.setText("0");
        WithdrawJTextField.setText("0");
    }

    private void DeleteAccountJButtonActionPerformed(ActionEvent event) {

        if (Accounts.size() == 0) {
            displayJTextArea.setText("No Accounts currently created");
        } else {
            // get user input
            int AccountNum = Integer.parseInt(AccountNumJTextField.getText());

            for (int i = 0; i < Accounts.size(); i++) {
                // get the element
                Account tempAccount = Accounts.get(i);
                if ((tempAccount.getAccountNum() == AccountNum)) {
                    Accounts.remove(i);
                    //break;
                }
            }
        }
        NameJTextField.setText("");
        AccountNumJTextField.setText("0");
        BalanceJTextField.setText("0");
        DepositJTextField.setText("0");
        WithdrawJTextField.setText("0");
    }

    private void TransactionJButtonActionPerformed(ActionEvent event) {
        displayJTextArea.setText("");

        if (Accounts.size() == 0) {
            displayJTextArea.setText("No Accounts currently created");
        } else {

            // get user input
            int accountNum = Integer.parseInt(AccountNumJTextField.getText());
            int deposit = Integer.parseInt(DepositJTextField.getText());
            int withdraw = Integer.parseInt(WithdrawJTextField.getText());


            for (int i = 0; i < Accounts.size(); i++) {
                // get the element and set to TempAccount
                Account tempAccount = Accounts.get(i);
                // if account number matches and deposit field has entry then deposit in account
                if ((tempAccount.getAccountNum() == accountNum) && (deposit > 0)) {
                    tempAccount.setBalance(tempAccount.getBalance() + deposit);
                    Accounts.set(i, tempAccount);
                    displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " "
                            + tempAccount.getBalance());
                }
                // if account number matches and withdrawal field has entry then withdraw from account
                if ((tempAccount.getAccountNum() == accountNum) && (withdraw > 0)) {
                    tempAccount.setBalance(tempAccount.getBalance() - withdraw);
                    Accounts.set(i, tempAccount);
                    displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " "
                            + tempAccount.getBalance());
                }
            }
        }

        // clear other JTextFields for new data
        NameJTextField.setText("");
        AccountNumJTextField.setText("0");
        BalanceJTextField.setText("0");
        DepositJTextField.setText("0");
        WithdrawJTextField.setText("0");
    }

    private void DisplayJButtonActionPerformed(ActionEvent event) {
        name = NameJTextField.getText();
        displayJTextArea.setText("");

        if (Accounts.isEmpty()) {
            displayJTextArea.setText("No Accounts currently created");
        } else {
            for (Account account : Accounts) {
                displayJTextArea.append(account.getAccountName() + " " + account.getAccountNum() + " "
                        + account.getBalance() + "\n");
            }
        }
        // clear other JTextFields for new data
        NameJTextField.setText("");
        AccountNumJTextField.setText("0");
        BalanceJTextField.setText("0");
        DepositJTextField.setText("0");
        WithdrawJTextField.setText("0");
    }

    public static void main(String[] args) {
        // Populate arrays with the word EMPTY
        // so we can check to see if the values are empty later

        JavaBankArrayListDelete application = new JavaBankArrayListDelete();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}