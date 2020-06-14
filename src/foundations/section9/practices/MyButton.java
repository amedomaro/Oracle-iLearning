package foundations.section9.practices;

/**
 @author Aleksandr Ilin
 */

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MyButton extends Button {
    private String color, name;
    protected Button friends;

    protected MyButton(String name, double x, double y, String color) {
        setName(name);
        setColor(color);
        this.setText(getName());
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setFont(Font.font("Default", FontWeight.BOLD, 13));
        this.setStyle(String.format("-fx-background-color: %s", getColor()));

        friends = new Button("Friends");
        friends.setLayoutX(x + 75);
        friends.setLayoutY(y);
        friends.setFont(Font.font("Default", FontWeight.BOLD, 13));
        friends.setStyle(String.format("-fx-background-color: %s", getColor()));

        Main.root.getChildren().addAll(this, friends);
    }

    // Below getters and setters

    protected String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
