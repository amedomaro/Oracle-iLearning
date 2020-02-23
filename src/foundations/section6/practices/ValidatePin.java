package foundations.section6.practices;

import java.io.IOException;

public class ValidatePin {
    public static void main(String[] args) throws IOException {
        Number num = new Number();
        int input, pin = 2354;

        do {

            System.out.print("Enter PIN: ");
            input = num.getInteger();

        } while (input != pin);

        System.out.println("You have access to an account...");
        num.br.close();
    }
}
