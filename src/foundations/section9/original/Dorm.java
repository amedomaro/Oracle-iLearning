package foundations.section9.original;

import java.awt.geom.Point2D.Double;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Dorm {
    public static final int MIN_POPULATION = 50;
    public static final int MAX_POPULATION = 400;
    public int xLocation;
    public int yLocation;
    public int population;
    public String text;
    private Double iconGrabPosition = new Double(0.0D, 0.0D);
    private Double mouseGrabPosition = new Double(0.0D, 0.0D);
    private Double mouseReleasePosition = new Double(0.0D, 0.0D);
    PopulationChanger popChanger;
    public Rectangle dormRect = new Rectangle();
    public Color fillColor;
    public Color outlineColor;
    public Text display;

    public Dorm(int x, int y, int pop, String s, Color c) {
        this.outlineColor = Color.YELLOW;
        this.display = new Text();
        this.xLocation = x;
        this.yLocation = y;
        this.population = pop;
        this.text = s;
        this.fillColor = c;
        this.display.setFill(Color.RED);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(4.0D);
        dropShadow.setSpread(1.0D);
        dropShadow.setColor(Color.BLACK);
        this.display.setEffect(dropShadow);
        this.display.setFont(Font.font("Default", FontWeight.BOLD, 16.0D));
        JavaFXApp.root.getChildren().addAll(new Node[]{this.dormRect, this.display});
        this.interactions();
        this.updateDrawing();
    }

    public void updateDrawing() {
        this.dormRect.setWidth(150.0D * (1.0D * (double)this.population / 400.0D));
        this.dormRect.setHeight(150.0D * (1.0D * (double)this.population / 400.0D));
        this.dormRect.setLayoutX((double)this.xLocation - this.dormRect.getWidth() / 2.0D);
        this.dormRect.setLayoutY((double)this.yLocation - this.dormRect.getHeight() / 2.0D);
        this.dormRect.setFill(this.fillColor);
        this.dormRect.setStroke(this.outlineColor);
        this.display.setText(this.text + ":\n" + this.population);
        this.display.setLayoutX(this.dormRect.getLayoutX() - 40.0D);
        this.display.setLayoutY(this.dormRect.getLayoutY() + this.dormRect.getHeight() + 15.0D);
        this.display.setTextAlignment(TextAlignment.CENTER);
        this.display.setWrappingWidth(this.dormRect.getWidth() + 80.0D);
    }

    private void interactions() {
        this.dormRect.setOnMouseEntered((me) -> {
            this.highlight();
        });
        this.dormRect.setOnMouseExited((me) -> {
            this.unhighlight();
        });
        this.dormRect.setOnMousePressed((me) -> {
            this.mouseGrabPosition.x = me.getSceneX();
            this.mouseGrabPosition.y = me.getSceneY();
            this.iconGrabPosition.x = (double)this.xLocation;
            this.iconGrabPosition.y = (double)this.yLocation;
            this.dormRect.toFront();
        });
        this.dormRect.setOnMouseDragged((me) -> {
            this.mouseReleasePosition.x = me.getSceneX();
            this.mouseReleasePosition.y = me.getSceneY();
            this.xLocation = (int)(me.getSceneX() - this.mouseGrabPosition.x + this.iconGrabPosition.x);
            this.yLocation = (int)(me.getSceneY() - this.mouseGrabPosition.y + this.iconGrabPosition.y);
            this.updateDrawing();
            CenterPoint.updateAllPoint();
        });
        this.display.setOnMousePressed((me) -> {
            if (this.popChanger == null) {
                this.mouseGrabPosition.x = me.getSceneX();
                this.iconGrabPosition.x = (double)this.population;
                this.popChanger = new PopulationChanger(this.population);
                this.popChanger.getScrollBar().setLayoutX(this.dormRect.getLayoutX());
                this.popChanger.getScrollBar().setLayoutY(this.dormRect.getLayoutY() + this.dormRect.getHeight() + 40.0D);
                JavaFXApp.root.getChildren().add(this.popChanger.getScrollBar());
            }

        });
        this.display.setOnMouseDragged((me) -> {
            this.mouseReleasePosition.x = me.getSceneX();
            int newValue = (int)(2.0D * me.getSceneX() - 2.0D * this.mouseGrabPosition.x + this.iconGrabPosition.x);
            if (newValue < 50) {
                newValue = 50;
            } else if (newValue > 400) {
                newValue = 400;
            }

            this.popChanger.setValue(newValue);
            this.population = newValue;
            this.updateDrawing();
            CenterPoint.updateAllPoint();
            this.popChanger.getScrollBar().setLayoutY(this.dormRect.getLayoutY() + this.dormRect.getHeight() + 40.0D);
        });
        this.display.setOnMouseReleased((me) -> {
            this.popChanger.getScrollBar().toBack();
            if (this.popChanger != null) {
                JavaFXApp.root.getChildren().remove(this.popChanger.getScrollBar());
                this.popChanger = null;
            }

        });
    }

    private void highlight() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(15.0D);
        dropShadow.setColor(Color.rgb(255, 253, 153));
        this.dormRect.setEffect(dropShadow);
    }

    private void unhighlight() {
        this.dormRect.setEffect((Effect)null);
    }
}

