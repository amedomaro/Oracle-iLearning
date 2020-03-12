package foundations.section9.javaFX03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button();
        btn1.setText("OMG");
        btn1.setOnAction(event -> System.out.println("text1"));


        Button btn2 = new Button();
        btn2.setText("WTF");
        btn2.setOnAction(event -> System.out.println("text2"));

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btn1, btn2);
        hBox.setLayoutY(200);
        hBox.setLayoutX(100);

        Group root = new Group();
        root.getChildren().add(hBox);

        primaryStage.setTitle("new program");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
