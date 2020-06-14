package programming.section3.collections1.bikeProject.bikeProject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public interface RoadParts {

    //String TERRAIN = "track_racing";
    BikeUses TERRAIN = BikeUses.TRACK;

    int getTyreWidth();
    void setTyreWidth(int newValue);
    int getPostHeight();
    void setPostHeight(int newValue);

}
