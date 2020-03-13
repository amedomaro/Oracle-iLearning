package foundations.section9.javaFX06;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {

    protected Goal(){
        Image duke = new Image(getClass().getResource("Images/Duke.png").toString());

        GoalTest.root.getChildren().add(new ImageView(duke));

        //interactions();
    }

    private void interactions(){
        //Exercise 4

    }
}
