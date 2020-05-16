package programming.section4.stringExample.accountGenerator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();

        System.out.println(employee.toString());

        InputValue.br.close();  // Close thread System.in

    }
}
