package programming.section3.generics.bikeProject.bikeproject.src.bikeproject;

public interface MountainParts {

    //String TERRAIN = "off_road";
    BikeUses TERRAIN = BikeUses.OFF_ROAD;

    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}
