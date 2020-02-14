package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void getBmi() throws IOException {
        System.out.print("Enter the weight in pounds: ");
        double weight = getValue();

        System.out.print("Enter the height in inches: ");
        double height = getValue();

        System.out.printf("Your Body Mass Index is: %d", Math.round (weight / (height * height) * 703));

        br.close();

    }

    private double getValue() {
        double temp;

        while (true) {

            try {
                String input = br.readLine();

                if (input.matches("(([-+])?[0-9]+(\\.[0-9]+)?)+")) {    // Check for double
                    temp = Double.parseDouble(input);

                    if (temp > 0) {
                        return temp;
                    } else {
                        System.out.print("The number must be greater than 0!!!\nEnter the number: ");
                    }

                } else {
                    System.out.printf("%s - is not a number!!!\nEnter the number: ", input);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
