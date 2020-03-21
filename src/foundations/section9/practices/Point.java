package foundations.section9.practices;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Point {
    private double x, y;
    private Circle point;

    protected Point(String text) {
        getPosition();
        point = new Circle(x, y, 5, Color.RED);
        Main.root.getChildren().add(point);
    }

    private void getPosition() {
        for (Dorm dorm : Dorm.getDormList()) {
            x += dorm.getX() + ((double) dorm.getPopulations() / 100);
            y += dorm.getY() + ((double) dorm.getPopulations() / 100);
        }
        x /= Dorm.getDormList().size();
        y /= Dorm.getDormList().size();
    }

    protected void updatePoint(){
        getPosition();
        point.setLayoutX(x);
        point.setLayoutY(y);
    }
}
