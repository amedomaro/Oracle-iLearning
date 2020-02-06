package foundations.section3.input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        String input = JOptionPane.showInputDialog("Type something:");
        JOptionPane.showInputDialog("You entered:", input);

        //Parse the input as an int.
        //Print its value +1

        String str = JOptionPane.showInputDialog("Type number:");

        try {
            int num = Integer.parseInt(str) + 1;
            JOptionPane.showInputDialog("Your number + 1:", num);
        } catch (NumberFormatException e){
            JOptionPane.showInputDialog("You were asked to enter a number!",
                    String.format("%s - is not a number!!!", str));
        }

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        int num = Integer.parseInt(JOptionPane.showInputDialog("Type number:")); // There may be errors...
        System.out.println(num);

    }
}
