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
        Scene scene = new Scene(root, 1198, 755);
        
        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Dorm.addDormList(new Dorm(770, 110, new MyButton("DORM 1", 40, 290, "DODGERBLUE")));
        Dorm.addDormList(new Dorm(885, 125, new MyButton("DORM 2", 40, 340, "LIGHTPINK")));
        Dorm.addDormList(new Dorm(1030, 150, new MyButton("DORM 3", 40, 390, "GREENYELLOW")));
        Dorm.addDormList(new Dorm(550, 450, new MyButton("DORM 4", 40, 440, "GOLD")));
        Dorm.addDormList(new Dorm(950, 650, new MyButton("DORM 5", 40, 490, "FIREBRICK")));

        Dorm.updates = new Point("All Students");

        launch(args);
    }

}
