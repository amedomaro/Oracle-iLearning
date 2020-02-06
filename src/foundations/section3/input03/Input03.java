package foundations.section3.input03;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner

        //Find and print the sum of three integers entered by the user

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter three integers :");
            System.out.printf("Sum of numbers = %d\n",
                    sc.nextInt() + sc.nextInt() + sc.nextInt());

        } catch (InputMismatchException e) {
            System.err.println("Error : You entered an invalid value (not an integer) !!!");
            System.out.println("Try it again ...");
        }

        //Remember to close the Scanner
    }
}