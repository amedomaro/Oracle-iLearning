package foundations.section9.practices;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Dorm {
    private double x, y;
    private String name, input;
    private int populations, friends;
    private Circle circle;
    private Text text;
    private static List<Dorm> dormList = new ArrayList<>();

    protected Dorm(double x, double y, MyButton button) {
        setX(x);
        setY(y);
        setName(button.getName());

        circle = new Circle(getX(), getY(), 7, Paint.valueOf(button.getColor()));
        circle.setOpacity(0.7);

        text = new Text(getX() - 40, getY() + 20,
                String.format("     %s\nPopulation: %d\n    Friends: %d",getName(), getPopulations(), getFriends()));
        text.setFill(Color.DARKRED);
        text.setFont(Font.font("Default", FontWeight.BOLD, 12));

        Main.root.getChildren().addAll(circle, text);

        button.setOnAction(event -> addPeople());
        button.friends.setOnAction(event -> addFriends());
        circle.setOnMouseClicked(event -> addPeople());
    }

    private void addPeople() {
        input = JOptionPane.showInputDialog(null, "Enter an integer from 0 to 300",
                String.format("How many people live in %s", getName()), JOptionPane.PLAIN_MESSAGE);

        if (input != null) {
            setPopulations(getValue());
            circle.setRadius((double) getPopulations() / 5);
            text.setText(String.format("    %s\nPopulation: %d\n    Friends: %d",getName(), getPopulations(), getFriends()));
        }
    }

    private void addFriends() {
        input = JOptionPane.showInputDialog(null, "Enter an integer from 0 to 300",
                String.format("How many friends live in %s", getName()), JOptionPane.PLAIN_MESSAGE);

        if (input != null) {
            setFriends(getValue());

            if (getFriends() > getPopulations()){
                setPopulations(getFriends());
                circle.setRadius((double) getPopulations() / 5);
            }

            text.setText(String.format("    %s\nPopulation: %d\n    Friends: %d",getName(), getPopulations(), getFriends()));
        }
    }

    private int getValue() {
        if (input.matches("(-?\\d+)")) {
            int num = Integer.parseInt(input);

            if (num >= 0 && num <= 300) {
                return num;
            } else {
                JOptionPane.showMessageDialog(null, "The number must be from 0 to 300",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, String.format("%s - is not a integer !", input),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return getPopulations();
    }

    // Below getters and setters

    protected static List<Dorm> getDormList() {
        return dormList;
    }

    protected static void addDormList(Dorm dorm) {
        Dorm.dormList.add(dorm);
    }

    protected double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    protected double getY() {
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

    private int getFriends() {
        return friends;
    }

    private void setFriends(int friends) {
        this.friends = friends;
    }
}
