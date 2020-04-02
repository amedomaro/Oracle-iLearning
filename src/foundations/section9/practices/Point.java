package foundations.section9.practices;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public abstract class Point implements PositionUpdates {
    private double x, y;
    private Circle point;
    private Text text;

    protected Point(String text) {
        getCenter();
        point = new Circle(x, y, 5, Color.RED);

        this.text = new Text(x - 40, y + 20, text);
        this.text.setFill(Color.INDIGO);
        this.text.setFont(Font.font("Default", FontWeight.BOLD, 12));

        Main.root.getChildren().addAll(point, this.text);
        point.toFront();
    }

    private void getCenter() {
        for (Dorm dorm : Dorm.getDormList()) {
            x += dorm.getX();
            y += dorm.getY();
        }

        x /= Dorm.getDormList().size();
        y /= Dorm.getDormList().size();
    }

    // Below getters and setters

    protected Circle getPoint() {
        return point;
    }

    protected Text getText() {
        return text;
    }

    protected void setText(Text text) {
        this.text = text;
    }

    protected double getX() {
        return x;
    }

    protected double getY() {
        return y;
    }
}
