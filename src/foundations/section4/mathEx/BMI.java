package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    double weight = 0.0, height = 0;

    public void getWeight() {

        System.out.print("Enter the weight in pounds: ");

        getValue();

        System.out.println(weight);
    }

    private void getValue() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = br.readLine();

            if (input.matches("\\D++")) {
                System.out.printf("%s - is not a number!!!\n", input);


            } else {
                weight = Double.parseDouble(input);
            }

        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}
