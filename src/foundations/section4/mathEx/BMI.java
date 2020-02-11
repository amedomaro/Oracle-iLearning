package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    double weight = 0.0, height = 0, test = 0.0;

    public void getWeight() {

        System.out.print("Enter the weight in pounds: ");

       weight = getValue();
    }
    public void getHeight() {

        System.out.print("Enter the height in pounds: ");

        height = getValue();
    }

    private double getValue() {

        double input;
        String str = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                str = br.readLine();
                input = Double.parseDouble(str);

                    if (input <= 0.0) {
                        System.out.printf("%s - is number <= 0!!!\n", input);
                        System.out.print("Please enter number :");
                        getValue();

                    } else
                        test = input;
                        return input;

            } catch (NumberFormatException | IOException e) {

                System.out.printf("%s - is not a number!!!\n", str);
                System.out.print("Please enter number :");
                getValue();
            }
        return test ;
    }
}
