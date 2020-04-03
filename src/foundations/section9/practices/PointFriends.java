package foundations.section9.practices;

public class PointFriends extends Point {

    protected PointFriends(String text) {
        super(text);
        getText().setX(getX() - 20);
        getText().setY(getY() - 10);
    }

    @Override
    public void update() {
        double x = 0, y = 0, friends = 0;

        for (Dorm dorm : Dorm.getDormList()) {
            x += dorm.getX() * dorm.getFriends();
            y += dorm.getY() * dorm.getFriends();
            friends += dorm.getFriends();
        }

        getPoint().setCenterX(x / friends);
        getPoint().setCenterY(y / friends);
        getText().setX(getPoint().getCenterX() - 20);
        getText().setY(getPoint().getCenterY() - 10);
    }
}
