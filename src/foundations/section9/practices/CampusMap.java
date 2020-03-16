package foundations.section9.practices;

import javafx.scene.image.ImageView;

public class CampusMap {

    protected CampusMap(){
        ImageView mapView = new ImageView(getClass().getResource("Images/map.jpg").toString());
        Main.root.getChildren().add(mapView);

        interactions();
    }

    private void interactions(){

    }
}
