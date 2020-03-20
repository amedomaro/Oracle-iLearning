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

        Dorm.addDormList(new Dorm(196, 381, new MyButton("DORM 1", 100, 440, "DODGERBLUE")));
        Dorm.addDormList(new Dorm(137, 229, new MyButton("DORM 2", 300, 440, "LIGHTPINK")));
        Dorm.addDormList(new Dorm(294, 112, new MyButton("DORM 3", 500, 440, "GOLD")));
        Dorm.addDormList(new Dorm(210, 174, new MyButton("DORM 4", 700, 440, "GREENYELLOW")));

        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }

}
