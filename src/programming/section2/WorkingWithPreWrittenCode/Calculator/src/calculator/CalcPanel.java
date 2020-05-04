package programming.section2.WorkingWithPreWrittenCode.Calculator.src.calculator;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener {
    String num1 = "";
    String num2 = "";
    String operator = "";
    boolean usingFirst = true;
    double total = 0;
    JTextField display;

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bDec = new JButton(".");
    JButton bClear = new JButton("C");
    JButton bEquals = new JButton("=");
    JButton bPlus = new JButton("+");
    JButton bMultiplication = new JButton("*");
    JButton bSubtraction = new JButton("/");

    public CalcPanel() {
        this.setBackground(Color.white);
        setLayout(null);
        display = new JTextField();

        display.setBounds(0, 0, 205, 50);

        b1.setBounds(0, 200, 50, 50);
        b2.setBounds(50, 200, 50, 50);
        b3.setBounds(100, 200, 50, 50);
        bPlus.setBounds(154, 200, 50, 50);

        b4.setBounds(0, 150, 50, 50);
        b5.setBounds(50, 150, 50, 50);
        b6.setBounds(100, 150, 50, 50);
        bMultiplication.setBounds(154, 150, 50, 50);

        b7.setBounds(0, 100, 50, 50);
        b8.setBounds(50, 100, 50, 50);
        b9.setBounds(100, 100, 50, 50);
        bSubtraction.setBounds(154, 100, 50, 50);

        b0.setBounds(0, 250, 50, 50);
        bDec.setBounds(50, 250, 50, 50);
        bClear.setBounds(100, 250, 50, 50);
        bEquals.setBounds(154, 250, 50, 50);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bDec);
        add(display);
        add(bClear);
        add(bEquals);
        add(bPlus);
        add(bMultiplication);
        add(bSubtraction);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bEquals.addActionListener(this);
        bPlus.addActionListener(this);
        bMultiplication.addActionListener(this);
        bSubtraction.addActionListener(this);
        bClear.addActionListener(this);
        bDec.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") ||
                s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") ||
                s.equals("9") || s.equals("0") || s.equals(".")) {

            if (usingFirst) {
                num1 = num1 + s;
                display.setText(num1);
            } else {
                num2 = num2 + s;
                display.setText(num2);
            }
        }


        if (s.equals("+")) {
            usingFirst = false;
            operator = "+";
        }

        if (s.equals("*")) {
            usingFirst = false;
            operator = "*";
        }

        if (s.equals("/")) {
            usingFirst = false;
            operator = "/";
        }


        if (s.equals("=")) {

            switch (operator) {
                case "+":
                    total = Double.parseDouble(num1) + Double.parseDouble(num2);
                    display.setText("" + total);
                    break;
                case "*":
                    total = Double.parseDouble(num1) * Double.parseDouble(num2);
                    display.setText("" + total);
                    break;
                case "/":
                    total = Double.parseDouble(num1) / Double.parseDouble(num2);
                    display.setText("" + total);
                    break;
            }

            usingFirst = true;
            num1 = "";
            num2 = "";
            operator = "";
        }

        if (s.equals("C")) {
            display.setText("");
            usingFirst = true;
            num1 = "";
            num2 = "";
            total = 0;
        }
    }
}
