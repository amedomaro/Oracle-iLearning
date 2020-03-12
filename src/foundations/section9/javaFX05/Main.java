package foundations.section9.javaFX05;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        //Rectangle rectangle = new Rectangle(120, 100, 60, 40);
        Rectangle rectangle = new Rectangle();

        rectangle.setX(120);                  // Sets the X position of the Rectangle
        rectangle.setY(100);                  // Sets the Y position of the Rectangle
        rectangle.setWidth(60);               // Sets the width of the Rectangle
        rectangle.setHeight(40);              // Sets the height of the Rectangle
        rectangle.setFill(Color.RED);         // Sets the color of the Rectangle
        rectangle.setStroke(Color.GREEN);     // Sets the color of the Rectangle’s outline
        rectangle.setStrokeWidth(3.5);        // Sets the width of the Rectangle’s outline

        root.getChildren().add(rectangle);

        primaryStage.setTitle("new program");
        primaryStage.setScene(new Scene(root, 300, 250, Color.color(0.7, 0.5, 0.8)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
