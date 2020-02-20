package foundations.section5.SwitchEx01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int num;

    protected void setNum() throws IOException {
        num = getValue();
        br.close();
    }

    protected int getNum() {
        return num;
    }

    private int getValue() {
        String input;
        int temp;

        while (true) {
            try {
                input = br.readLine();

                if (input.matches("(([-+])?\\d+)")) {
                    temp = Integer.parseInt(input);

                    if (temp > 0) {
                        return temp;
                    } else {
                        System.out.print("The number must be greater than 0!!!\nEnter the integer: ");
                    }

                } else {
                    System.out.printf("%s - is not a INTEGER!!!\nEnter the integer: ", input);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
