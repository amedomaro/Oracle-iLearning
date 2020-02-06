package foundations.section3.input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        String input = JOptionPane.showInputDialog("Type something:");
        JOptionPane.showMessageDialog(null,
                String.format("You entered:   %s", input),"Answer", JOptionPane.INFORMATION_MESSAGE);

        //Parse the input as an int.
        //Print its value +1

        String str = JOptionPane.showInputDialog("Type number:");

        try {
            int num = Integer.parseInt(str) + 1;
            JOptionPane.showInputDialog("Your number + 1:", num);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    String.format("You were asked to enter a number!\n %s - is not a number!!!", str),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        int num = Integer.parseInt(JOptionPane.showInputDialog("Type number:")); // There may be errors...
        System.out.println(num);

    }
}
