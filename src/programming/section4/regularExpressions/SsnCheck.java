package programming.section4.regularExpressions;

import java.util.Scanner;

public class SsnCheck {

    protected void getSsn(Scanner in) {
        System.out.print("Please enter your Social Security Number: ");

        while (true) {
            String ssn = in.nextLine();

            if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
                System.out.printf("%s is a valid Social Security Number!", ssn);
                return;
            } else {
                System.out.print("This ssn is not valid! Must be in the format of (999-99-9999)\nTry it again: ");
            }
        }
    }

    public static void main(String[] args) {
        SsnCheck check = new SsnCheck();
        Scanner sc = new Scanner(System.in);

        check.getSsn(sc);

        sc.close(); // close thread System.in
    }
}
