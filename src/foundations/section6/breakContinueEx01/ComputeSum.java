package foundations.section6.breakContinueEx01;

import java.io.IOException;

public class ComputeSum {

    public static void main(String[] args) throws IOException {

        Number number = new Number();
        double num, sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number: ");
            num = number.getNum();
            sum += num;

            if (num == 0) {
                break;
            }
        }

        number.br.close();
        System.out.printf("Sum of entered numbers = %.2f", sum);
    }
}
