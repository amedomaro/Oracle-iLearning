package foundations.section5.IfElseEx02;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input;
        int num;

        // System.out.println("Enter a number:");
        while (true) {
            System.out.print("Enter a integer: ");
            input = in.nextLine();

            if (input.matches("(([-+])?\\d+)")) {
                num = Integer.parseInt(input);
                break;

            } else {
                System.out.printf("Integer entered incorrectly (was introduced: %s)\n", input);
            }
        }
        //num = in.nextInt();
        //System.out.println(num);

        if (num % 2 == 0) {
            System.out.printf("The num is even: %d", num);
        } else {
            System.out.printf("The num is odd: %d", num);
        }

        in.close();
    }
}
