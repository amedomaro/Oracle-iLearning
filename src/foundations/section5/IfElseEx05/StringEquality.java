package foundations.section5.IfElseEx05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEquality {
    public static void main(String[] args) {

        String name = "";
        System.out.print("Input your name: ");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            name = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        if (name.equalsIgnoreCase("Moe")){
            System.out.println("You are the king of rock and roll.");
        } else {
            System.out.println("You are not the king.");
        }

    }
}
