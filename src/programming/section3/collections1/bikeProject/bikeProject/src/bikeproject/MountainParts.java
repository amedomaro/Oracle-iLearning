package programming.section3.collections1.bikeProject.bikeProject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public interface MountainParts {

    //String TERRAIN = "off_road";
    BikeUses TERRAIN = BikeUses.OFF_ROAD;

    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}
