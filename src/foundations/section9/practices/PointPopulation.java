package foundations.section9.practices;

public class PointPopulation extends Point{


    protected PointPopulation(String text) {
        super(text);
    }

    @Override
    public void update() {
        double x = 0, y = 0, population = 0;

        for (Dorm dorm : Dorm.getDormList()) {
            x += dorm.getX() * dorm.getPopulations();
            y += dorm.getY() * dorm.getPopulations();
            population += dorm.getPopulations();
        }

        getPoint().setCenterX(x / population);
        getPoint().setCenterY(y / population);
        getText().setX(getPoint().getCenterX() - 40);
        getText().setY(getPoint().getCenterY() + 20);
    }
}
