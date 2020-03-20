package foundations.section9.practices;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Dorm {
    private double x, y;
    private String name, input;
    private int populations = 35;
    private Circle circle;
    private static List<Dorm> dormList = new ArrayList<>();

    protected Dorm(double x, double y, MyButton button) {
        setX(x);
        setY(y);
        setName(button.getName());

        circle = new Circle(getX(), getY(), 7, Paint.valueOf(button.getColor()));
        circle.setOpacity(0.7);

        Main.root.getChildren().add(circle);

        button.setOnAction(event -> activation());
        circle.setOnMouseClicked(event -> activation());
    }

    private void activation() {
        input = JOptionPane.showInputDialog(null, "Enter an integer from 0 to 300",
                "How many people live in this dormitory?", JOptionPane.PLAIN_MESSAGE);

        if (input != null) {
            getValue();
            circle.setRadius((double) getPopulations() / 5);
        }
    }

    private void getValue() {
        if (input.matches("(-?\\d+)")) {
            int num = Integer.parseInt(input);

            if (num >= 0 && num <= 300) {
                setPopulations(num);
            } else {
                JOptionPane.showMessageDialog(null, "The number must be from 0 to 300",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, String.format("%s - is not a integer !", input),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Below getters and setters


    protected static List<Dorm> getDormList() {
        return dormList;
    }

    protected static void addDormList(Dorm dorm) {
        Dorm.dormList.add(dorm);
    }

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    private double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getPopulations() {
        return populations;
    }

    private void setPopulations(int populations) {
        this.populations = populations;
    }
}
