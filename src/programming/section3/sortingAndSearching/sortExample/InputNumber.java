package programming.section3.sortingAndSearching.sortExample;

/**
 @author Aleksandr Ilin
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    protected int getInteger() {

        int result;
        System.out.print("Input an integer: ");

        while (true) {
            try {
                String input = br.readLine();

                if (input.matches("(([-+])?\\d+)")) {
                    result = Integer.parseInt(input);

                    if (result > 0 ) {
                        return result;
                    } else {
                        System.out.print("The number must be greater than 0!!!\nEnter the number: ");
                    }

                } else {
                    System.out.printf("%s - is not a integer!!!\nTry again: ", input);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
