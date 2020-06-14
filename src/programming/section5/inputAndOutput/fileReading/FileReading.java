package programming.section5.inputAndOutput.fileReading;

/**
 @author Aleksandr Ilin
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {
    private BufferedReader fileInput;

    private void displayEmployees(List<String> employees) {
        for (String element : employees) {
            System.out.println(element);
        }
    }

    private void readFile(List<String> employees) {
        try {
            fileInput = new BufferedReader(new FileReader("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutput/employees.txt"));
            String line = fileInput.readLine();

            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        FileReading reading = new FileReading();

        reading.readFile(employees);
        reading.displayEmployees(employees);

        reading.fileInput.close();
    }
}
