package foundations.section9.practices;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Group root = new Group();

    @Override
    public void start(Stage primaryStage) {
        CampusMap.getCampusMap();  // Singleton
        Scene scene = new Scene(root, 900, 590);
        MyButton btn1 = new MyButton("DORM 1", 100, 440, "DODGERBLUE");
        MyButton btn2 = new MyButton("DORM 2", 300, 440, "LIGHTPINK");
        MyButton btn3 = new MyButton("DORM 3", 500, 440, "GOLD");
        MyButton btn4 = new MyButton("DORM 4", 700, 440, "GREENYELLOW");

        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
