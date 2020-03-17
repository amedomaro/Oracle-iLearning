package foundations.section9.practices;

import javafx.scene.control.Button;

public class MyButton extends Button {

    protected MyButton(String name, double x, double y, String color) {
        this.setText(name);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setStyle("-fx-background-color: " + color);

        Main.root.getChildren().add(this);
    }

    protected void action() {
        this.setOnAction(event -> System.out.println("Hello World!"));
    }

}
