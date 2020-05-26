package programming.section5.inputAndOutput.fileHandling;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        FileHandling fh = new FileHandling();

        fh.readFile(employees);
        fh.displayEmployees(employees);
    }

}
