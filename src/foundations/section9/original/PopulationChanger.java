package foundations.section9.original;

import javafx.scene.control.ScrollBar;

public class PopulationChanger {
    private final ScrollBar xscrollBar = new ScrollBar();
    private final int xBarWidth = 100;
    private final int xBarHeight = 15;

    public PopulationChanger(int value) {
        this.xscrollBar.setMin(50.0D);
        this.xscrollBar.setMax(400.0D);
        this.setValue(value);
        this.xscrollBar.setMinSize(100.0D, 15.0D);
        this.xscrollBar.setPrefSize(100.0D, 15.0D);
        this.xscrollBar.setMaxSize(100.0D, 15.0D);
    }

    public ScrollBar getScrollBar() {
        return this.xscrollBar;
    }

    public void setValue(int value) {
        this.xscrollBar.setValue((double)value);
    }
}
