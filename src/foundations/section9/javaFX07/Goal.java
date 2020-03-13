package foundations.section9.javaFX07;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {
    private Image duke = new Image(getClass().getResource("Images/Duke.png").toString());
    ImageView dukeView = new ImageView(duke);

    private Image glove = new Image(getClass().getResource("Images/Glove.png").toString());
    ImageView gloveView = new ImageView(glove);

    protected Goal(){

        dukeView.setPreserveRatio(true);            // Scaling a Node the Right Way
        dukeView.setFitWidth(125);

        GoalTest.root.getChildren().addAll(dukeView, gloveView);

        //interactions();
    }

    private void interactions(){
        //Exercise 4

    }
}
