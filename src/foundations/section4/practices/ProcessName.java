package foundations.section4.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessName {

    private String name;

    public void printName() {
        name = getName();
        int index = name.indexOf(" ");

        System.out.printf("Your name is: %s, %s.", name.substring(0, index), name.substring(index + 1, index + 2));
    }

    private String getName() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.print("Type your first and last name: ");
                name = br.readLine();

                if (name.matches("\\D+\\s\\D+")) {
                    break;
                } else {
                    System.out.println("The name is entered incorrectly (example: Jenny Weaver)");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}