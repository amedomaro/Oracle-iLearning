package foundations.section9.javaFX08;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Goal {
    private Image duke = new Image(getClass().getResource("Images/Duke.png").toString());
    protected ImageView dukeView = new ImageView(duke);

    private Image glove = new Image(getClass().getResource("Images/Glove.png").toString());
    protected ImageView gloveView = new ImageView(glove);

    MediaPlayer player = new MediaPlayer(new Media(getClass().getResource("Audio/Note5.wav").toString()));

    protected Goal(){
        dukeView.setPreserveRatio(true);            // Scaling a Node the Right Way
        dukeView.setFitWidth(125);
        dukeView.setX(250);
        dukeView.setY(150);

        gloveView.setPreserveRatio(true);
        gloveView.setFitWidth(85);
        gloveView.setX(300);
        gloveView.setY(150);

        GoalTest.root.getChildren().addAll(dukeView, gloveView);
        //tone.

        //interactions();
    }

    private void interactions(){
        //Exercise 4

    }
}
