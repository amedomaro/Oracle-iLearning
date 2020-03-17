package foundations.section9.practices;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Dorm {
    private double x, y;
    private String name;
    private int populations;

    protected Dorm(double x, double y, MyButton button){
        setX(x);
        setY(y);
        setName(button.getName());

        Circle circle = new Circle(getX(), getY(), 7, Paint.valueOf(button.getColor()));
        circle.setOpacity(0.7);

        Main.root.getChildren().add(circle);

        button.setOnAction(event -> System.out.println("Hello World!"));
    }

    // Below getters and setters

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    private double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getPopulations() {
        return populations;
    }

    private void setPopulations(int populations) {
        this.populations = populations;
    }
}
