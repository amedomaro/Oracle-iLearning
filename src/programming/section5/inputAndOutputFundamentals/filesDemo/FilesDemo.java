package programming.section5.inputAndOutputFundamentals.filesDemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {


    private Path checkFiles(Path dirPath, Path filePath) {
        Path absPath = dirPath.resolve(filePath);

        try{
            if (Files.notExists(dirPath)){
                Files.createDirectories(dirPath);
            }

            if (Files.notExists(absPath)){
                Files.createFile(absPath);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return absPath;
    }

    private void displayFileStatus(Path users, Path settings) throws IOException {
        System.out.println("Readable  : "+ Files.isReadable(users));
        System.out.println("Writeable : "+ Files.isWritable(users));
        System.out.println("Executable: "+ Files.isExecutable(users));
        System.out.println("Hidden    : "+ Files.isHidden(users));
        System.out.println("Same files: "+ Files.isSameFile(users,  settings));
    }

    private void deleteFile(Path filePath) {
        try {
            if (Files.exists(filePath)) {
                Files.delete(filePath);
                System.out.println(filePath.toString() + " deleted!");
            } else {
                System.out.println(filePath.toString() + " not found!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        FilesDemo fDemo = new FilesDemo();
        Path dirPath = Paths.get("C:/Users/Amedomaro/Oracle-iLearning/src/programming/section5/inputAndOutputFundamentals");
        Path usersFilePath = Paths.get("HighScores.txt");
        Path settingsFilePath = Paths.get("Settings.txt");

        Path users = fDemo.checkFiles(dirPath, usersFilePath);
        Path settings = fDemo.checkFiles(dirPath, settingsFilePath);

        fDemo.displayFileStatus(users, settings);
        fDemo.deleteFile(settingsFilePath);


    }
}
