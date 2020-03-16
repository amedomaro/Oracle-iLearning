package foundations.section9.practices;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Group root = new Group();

    @Override
    public void start(Stage primaryStage) {
        CampusMap map = new CampusMap();
        Scene scene = new Scene(root, 900, 590);

        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
