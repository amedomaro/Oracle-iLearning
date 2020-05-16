package programming.section4.stringExample.accountGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValue {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    protected static String getValue() {
        String str;

        while (true) {
            System.out.println("Input your name and last name:");

            try {
                str =  br.readLine();
                if (str.matches("([a-zA-Z])+ ([a-zA-Z])+")){
                    return str;
                }else {
                    System.out.printf("incorrect input, you entered: %s\nInput example: Ivan Ivanov\n", str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

