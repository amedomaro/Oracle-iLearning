package foundations.section9.practices;

import javafx.scene.control.Button;

public class MyButton extends Button {
    private String color, name;

    protected MyButton(String name, double x, double y, String color) {
        setName(name);
        setColor(color);
        this.setText(getName());
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setStyle(String.format("-fx-background-color: %s", getColor()));

        Main.root.getChildren().add(this);
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
