package foundations.section9.javaFX06;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {

    protected Goal(){
        Image duke = new Image(getClass().getResource("Images/Duke.png").toString());
        ImageView dukeView = new ImageView(duke);

        dukeView.setPreserveRatio(true);            // Scaling a Node the Right Way
        dukeView.setFitWidth(125);

        GoalTest.root.getChildren().add(dukeView);

        //interactions();
    }

    private void interactions(){
        //Exercise 4

    }
}
