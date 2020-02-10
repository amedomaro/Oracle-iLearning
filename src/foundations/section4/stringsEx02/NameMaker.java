package foundations.section4.stringsEx02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameMaker {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String firstName = "", middleName = "", lastName = "", fullName;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter your  first name");
            firstName = br.readLine();

            System.out.println("Enter your middle name");
            middleName = br.readLine();

            System.out.println("Enter your last name");
            lastName = br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        fullName = sb.append(firstName).append(" ").append(middleName).append(" ").append(lastName).toString();
        System.out.printf("Your fullName : %s \n", fullName);

    }
}

