package foundations.section9.javaFX06;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {

    private Image duke = new Image(getClass().
            getResource("src/foundations/section9/javaFX06/Images/Duke.png").toString());
//    private Image glove = new Image(getClass().
//            getResource("src/foundations/section9/javaFX06/Images/Glove.png").toString());

    private ImageView dukeView = new ImageView(duke);
//    private ImageView gloveView = new ImageView(glove);

    protected Goal(){
        GoalTest.root.getChildren().add(dukeView);
        //interactions();
    }

    private void interactions(){
        //Exercise 4

    }
}
