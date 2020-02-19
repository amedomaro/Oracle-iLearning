package foundations.section5.ConditionalEx01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void movieSearch() throws IOException {
        System.out.print("Enter the movie ticket price: ");
        double price = getValue();

        System.out.print("Enter the rating film: ");
        double rating = getValue();

        if (price >= 12 && rating == 5) {
            System.out.println("I’m interested in watching the movie.");
        } else {
            System.out.println("I am not interested in watching the movie.");
        }

        br.close();
    }

    private double getValue() {
        double temp;

        while (true) {
            try {
                String input = br.readLine();

                if (input.matches("(([-+])?\\d+(\\.\\d+)?)+")) {
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
