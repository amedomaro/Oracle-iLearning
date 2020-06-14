package programming.section5.inputAndOutputFundamentals.fileSystem;

/**
 @author Aleksandr Ilin
 */

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem {

    public static void main(String[] args) {
        String line;
        Path path = Paths.get("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutput/employees.txt");

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)){

            line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
