package programming.section4.stringExample.accountGenerator;

/**
 @author Aleksandr Ilin
 */

import java.io.*;

public class AccountGenerator {

    private void serializeData(Employee employee) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "C:/Users/Amedomaro/Oracle-iLearning/src/programming/section4/stringExample/accountGenerator/employee.ser"))) {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object deSerialize(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "C:/Users/Amedomaro/Oracle-iLearning/src/programming/section4/stringExample/accountGenerator/employee.ser"))){
            return ois.readObject();

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws IOException {
        AccountGenerator accountGen = new AccountGenerator();
        Employee employee = new Employee();


        accountGen.serializeData(employee);
        System.out.println(accountGen.deSerialize().toString());


        InputValue.br.close();  // Close thread System.in

    }
}
