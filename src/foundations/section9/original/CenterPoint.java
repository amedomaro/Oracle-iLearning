package foundations.section9.original;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CenterPoint {
    private static final ArrayList<CenterPoint> allPoints = new ArrayList();
    private boolean isBuildings = true;
    Dorm[] dorms;
    public int xLocation;
    public int yLocation;
    public String text;
    private int distance;
    public Circle point = new Circle();
    public Color fillColor;
    public Color outlineColor;
    public Text display;

    public CenterPoint(String s, boolean isBuildings, Dorm... dorms) {
        this.fillColor = Color.BLACK;
        this.outlineColor = Color.YELLOW;
        this.display = new Text();
        this.text = s + "\nDistance: ";
        this.isBuildings = isBuildings;
        this.dorms = dorms;
        this.display.setFill(Color.RED);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(4.0D);
        dropShadow.setSpread(1.0D);
        dropShadow.setColor(Color.BLACK);
        this.display.setEffect(dropShadow);
        this.display.setFont(Font.font("Default", FontWeight.BOLD, 16.0D));
        JavaFXApp.root.getChildren().addAll(new Node[]{this.point, this.display});
        allPoints.add(this);
        this.calculateCenter();
        this.updateDrawing();
    }

    public void updateDrawing() {
        this.point.setCenterX((double)this.xLocation);
        this.point.setCenterY((double)this.yLocation);
        this.point.setRadius(10.0D);
        this.point.setFill(this.fillColor);
        this.point.setStroke(this.outlineColor);
        this.display.setText(this.text + this.distance);
        this.display.setX((double)(this.xLocation - 20));
        this.display.setY((double)this.yLocation + this.point.getRadius() + 15.0D);
    }

    public void calculateCenter() {
        if (this.isBuildings) {
            this.calculateDormCenter();
        } else {
            this.calculatePeopleCenter();
        }

        this.distance = this.calculateDistance(this.dorms[0]);
    }

    private void calculateDormCenter() {
        int pop = 0;
        int xWeight = 0;
        int yWeight = 0;
        Dorm[] var4 = this.dorms;
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Dorm dorm = var4[var6];
            xWeight += dorm.xLocation * dorm.population;
            yWeight += dorm.yLocation * dorm.population;
            pop += dorm.population;
        }

        this.xLocation = xWeight / pop;
        this.yLocation = yWeight / pop;
    }

    private void calculatePeopleCenter() {
        int xWeight = 0;
        int yWeight = 0;
        Dorm[] var3 = this.dorms;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Dorm dorm = var3[var5];
            xWeight += dorm.xLocation;
            yWeight += dorm.yLocation;
        }

        this.xLocation = xWeight / this.dorms.length;
        this.yLocation = yWeight / this.dorms.length;
    }

    private int calculateDistance(Dorm dorm) {
        return (int)Math.sqrt(Math.pow((double)(dorm.xLocation - this.xLocation), 2.0D) + Math.pow((double)(dorm.yLocation - this.yLocation), 2.0D));
    }

    public static final void updateAllPoint() {
        Iterator var0 = allPoints.iterator();

        while(var0.hasNext()) {
            CenterPoint point = (CenterPoint)var0.next();
            point.calculateCenter();
            point.updateDrawing();
            point.point.toFront();
            point.display.toFront();
        }

    }
}
