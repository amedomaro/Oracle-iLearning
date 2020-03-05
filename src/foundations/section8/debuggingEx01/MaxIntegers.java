package foundations.section8.debuggingEx01;

public class MaxIntegers {

    public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 3;
        //int max = 0;
        int max = Integer.MIN_VALUE; // solution

        if (num1 > num2 && num1 > num3) {
            max = num1;
        }

        if (num2 > num1 && num2 > num3) {
            max = num2;
        }

        if (num3 > num1 && num3 > num2) {
            max = num3;
        }


        System.out.println("The max of 3 numbers is " + max);

        // OR
        System.out.printf("The max of 3 numbers is: %d\n", Math.max(num1, Math.max(num2, num3)));
    }
}
