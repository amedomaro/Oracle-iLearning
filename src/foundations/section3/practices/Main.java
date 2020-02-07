package foundations.section3.practices;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Question q = new Question();
        String[] acceptableValues = {"Man", "Woman"};

        Answer.setSex((String) JOptionPane.showInputDialog(null,"make a choice",
                "Enter your gender", JOptionPane.WARNING_MESSAGE,null,acceptableValues,acceptableValues[1]));

        Answer.setAns1(JOptionPane.showInputDialog(null, q.getQuest1(), "Enter text here"));
        Answer.setAns2(JOptionPane.showInputDialog(null, q.getQuest2(), "Enter text here"));
        Answer.setAns3(JOptionPane.showInputDialog(null, q.getQuest3(), "Enter text here"));
        Answer.setAns4(JOptionPane.showInputDialog(null, q.getQuest4(), "Enter text here"));
        Answer.setAns5(JOptionPane.showInputDialog(null, q.getQuest5(), "Enter text here"));
        Answer.setAns6(JOptionPane.showInputDialog(null, q.getQuest6(), "Enter text here"));
        Answer.setAns7(JOptionPane.showInputDialog(null, q.getQuest7(), "Enter text here"));
        Answer.setAns8(JOptionPane.showInputDialog(null, q.getQuest8(), "Enter text here"));
        Answer.setAns9(JOptionPane.showInputDialog(null, q.getQuest9(), "Enter text here"));
        Answer.setAns10(JOptionPane.showInputDialog(null, q.getQuest10(), "Enter text here"));

        JOptionPane.showMessageDialog(null, Text.getText());
        System.out.println("Bye!");
    }
}
