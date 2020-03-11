package foundations.section9.javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("WTF");
        btn.setOnAction(event -> System.out.println("Hello World!"));

        StackPane root = new StackPane();  // TitlePane
        root.getChildren().add(btn);

        primaryStage.setTitle("new program");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

//      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
