package foundations.section9.practices;

import javafx.scene.control.Button;

public class MyButton extends Button {
    private String color;

    protected MyButton(String name, double x, double y, String color) {
        this.setText(name);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setColor(color);
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
}
