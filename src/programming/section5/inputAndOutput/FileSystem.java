package programming.section5.inputAndOutput;

/**
 @author Aleksandr Ilin
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutput/demoFile.txt"))){
            String line = br.readLine();

            while(line != null){
                buffer.add(line);
                line = br.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        for(String element : buffer){
            System.out.println(element);
        }
    }
}
