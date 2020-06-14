package programming.section3.generics.bikeProject.bikeProject.src.bikeproject;

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
