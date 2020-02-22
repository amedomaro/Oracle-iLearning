package foundations.section6.WhileLoopEx01;

import java.util.Scanner;

public class SquareRootWhile {

    public static void main(String[] args) {

        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        //int number = console.nextInt();

     // Solution

        while (true) {
            String str = console.nextLine();

            if (str.matches("(([-+])?\\d+(\\.\\d+)?)+")) {
                double number = Double.parseDouble(str);

                if (number > 0) {
                    System.out.printf("The square root of %.0f is %.1f", number, Math.sqrt(number));
                    console.close();
                    break;

                } else {
                    System.out.printf("%f Invalid number, try again !!!:\nEnter the non-negative number: ", number);
                }
            } else {
                System.out.printf("%s - is not a number!!!\nEnter the non-negative number: ", str);
            }
        }
    }
}