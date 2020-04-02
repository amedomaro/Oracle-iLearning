package foundations.section9.practices;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Point implements PositionUpdates {
    private double x, y, startX, startY;
    private Circle point;

    protected Point(String text) {
        getPosition();
        point = new Circle(x, y, 5, Color.RED);
        Main.root.getChildren().add(point);
        point.toFront();
    }

    private void getPosition() {

        for (Dorm dorm : Dorm.getDormList()) {
            x += dorm.getX();
            y += dorm.getY();
        }

        x /= Dorm.getDormList().size();
        y /= Dorm.getDormList().size();
    }

    private double adjustment(double coordinateDorm, double coordinatePoint, int population) {

        if (coordinateDorm < coordinatePoint) {
            return coordinateDorm - population;
        } else if (coordinateDorm > coordinatePoint) {
            return coordinateDorm + population;
        } else {
            return coordinatePoint;
        }
    }

    @Override
    public void update() {
        double x = 0, y = 0;

        for (Dorm dorm : Dorm.getDormList()) {
            x += adjustment(dorm.getX(), point.getCenterX(), dorm.getPopulations());
            y += adjustment(dorm.getY(), point.getCenterY(), dorm.getPopulations());
        }

        point.setCenterX(x / Dorm.getDormList().size());
        point.setCenterY(y / Dorm.getDormList().size());
    }
}