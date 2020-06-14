package programming.section5.inputAndOutput.fileHandling;

/**
 @author Aleksandr Ilin
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

    private void displayEmployees(List<String> employees) {
        for(String element : employees){
            System.out.println(element);
        }
    }

    private void readFile(List<String> employees) {
        String line;
        Path path = Paths.get("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutput/employees.txt");

        try (BufferedReader fileInput = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)){
            line = fileInput.readLine();

            while (line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void writeFile(List<String> employees){
        Path path = Paths.get("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutput/userName.txt");

        try (BufferedWriter fileOutput = Files.newBufferedWriter(path, StandardCharsets.ISO_8859_1,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)){

            for (String element : employees){
               fileOutput.write(element);
               fileOutput.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        FileHandling fh = new FileHandling();

        fh.readFile(employees);
        fh.displayEmployees(employees);
        fh.writeFile(employees);
    }

}
