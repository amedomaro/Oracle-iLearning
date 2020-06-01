package programming.section4.stringExample.accountGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountGenerator {

    private void serializeData(Employee employee) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) throws IOException {
        AccountGenerator accountGen = new AccountGenerator();
        Employee employee = new Employee();

        System.out.println(employee.toString());
        accountGen.serializeData(employee);


        InputValue.br.close();  // Close thread System.in

    }
}
