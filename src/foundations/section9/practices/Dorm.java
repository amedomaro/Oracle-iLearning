package foundations.section9.practices;

public class Dorm {
    private double x, y;
    private String name;
    private int populations;

    protected Dorm(double x, double y, MyButton button){
        this.setX(x);
        this.setY(y);
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

    protected void setName(String name) {
        this.name = name;
    }

    protected int getPopulations() {
        return populations;
    }

    protected void setPopulations(int populations) {
        this.populations = populations;
    }
}
