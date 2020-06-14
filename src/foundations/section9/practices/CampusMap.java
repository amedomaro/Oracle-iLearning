package foundations.section9.practices;

/**
 @author Aleksandr Ilin
 */

import javafx.scene.image.ImageView;

public class CampusMap {
    // Singleton
    private static CampusMap campusMap = null;

    private CampusMap() {
        ImageView mapView = new ImageView(getClass().getResource("Images/campus.png").toString());
        Main.root.getChildren().add(mapView);
        mapView.toBack();
        campusMap = this;
    }

    protected static void getCampusMap() {
        campusMap = campusMap == null ? new CampusMap() : campusMap;
    }
}
