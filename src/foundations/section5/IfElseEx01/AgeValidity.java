package foundations.section5.IfElseEx01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeValidity {

    public static void main(String[] args) {

        boolean drivingUnderAge = false;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input;

            while (true) {
                System.out.print("Input your age: ");
                input = br.readLine();

                if (input.matches("(([-+])?\\d+)")) {
                    int age = Integer.parseInt(input);

                    if (age > 18) {
                        drivingUnderAge = true;
                    } break;

                } else {
                    System.out.printf("Age entered incorrectly (was introduced: %s)\ny67ujh", input);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("drivingUnderAge (%b)", drivingUnderAge);

    }
}
