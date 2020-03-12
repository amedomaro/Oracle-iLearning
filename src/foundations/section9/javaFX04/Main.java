package foundations.section9.javaFX04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        primaryStage.setTitle("new program");
        primaryStage.setScene(new Scene(root, 300, 250, Color.color(0.7, 0.5, 0.8)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
