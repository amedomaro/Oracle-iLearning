package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    private double weight = 0.0, height = 0;

    public void getBmi(){
        getWeight();
        System.out.println(1);
        getHeight();
        System.out.println(2);

    }

    public void getWeight() {
        System.out.print("Enter the weight in pounds: ");
        weight = getValue();
    }

    public void getHeight() {
        System.out.print("Enter the height in pounds: ");
        height = getValue();
    }

    private double getValue() {

        double result = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = br.readLine();

            if (input.matches("(([-+])?[0-9]+(\\.[0-9]+)?)+")) {    // Check for double
                result = Double.parseDouble(input);

                if (result <= 0){
                    System.out.println("The number must be greater than 0");
                }

            } else {
                System.out.printf("%s - is not a number!!!\n", input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
