package foundations.section8.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {
    protected BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    protected double getDouble() {
        double result;

        while (true) {
            try {
                String input = br.readLine();

                if (input.matches("(([-+])?\\d+(\\.\\d+)?)+")) {
                    result = Double.parseDouble(input);
                    return result;

                } else {
                    System.out.printf("%s - is not a number!!!\nEnter the number: ", input);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
