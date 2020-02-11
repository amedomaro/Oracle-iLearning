package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    public double weight, height, temp;

    public void getBmi(){
        System.out.print("Enter the weight in pounds: ");
        weight = getValue();

        System.out.print("Enter the height in inches: ");
        height = getValue();

    }

    private double getValue() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = br.readLine();

            if (input.matches("(([-+])?[0-9]+(\\.[0-9]+)?)+")) {    // Check for double
                temp = Double.parseDouble(input);

                if (temp <= 0){
                    System.out.print("The number must be greater than 0!!!\nEnter the number: ");
                    getValue();

                }

            } else {
                System.out.printf("%s - is not a number!!!\nEnter the number: ", input);
                getValue();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
