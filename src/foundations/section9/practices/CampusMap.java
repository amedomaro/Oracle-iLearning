package foundations.section9.practices;

import javafx.scene.image.ImageView;

public class CampusMap {
    private static CampusMap campusMap = null;

    private CampusMap() {
        ImageView mapView = new ImageView(getClass().getResource("Images/map.jpg").toString());
        Main.root.getChildren().add(mapView);
        mapView.toBack();
        campusMap = this;
    }

    protected static void getCampusMap() {
        campusMap = campusMap == null ? new CampusMap() : campusMap;
    }

}
