package foundations.section4.mathEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.getWeight();
        bmi.getHeight();
        System.out.println(bmi.weight);
        System.out.println(bmi.height);

    }
}
