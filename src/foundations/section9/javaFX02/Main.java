package foundations.section9.javaFX02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button();
        btn1.setText("OMG");
        btn1.setOnAction(event -> System.out.println("text1"));
        btn1.setLayoutY(100);
        btn1.setLayoutX(100);

        Button btn2 = new Button();
        btn2.setText("WTF");
        btn2.setOnAction(event -> System.out.println("text2"));

//        StackPane root = new StackPane();
//        root.getChildren().addAll(btn1, btn2);

//        TilePane root = new TilePane();
//        root.getChildren().addAll(btn1, btn2);

//        VBox root = new VBox();
//        root.getChildren().addAll(btn1, btn2);

        Group root = new Group();
        root.getChildren().addAll(btn1, btn2);

        primaryStage.setTitle("new program");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
