package programming.section2.javaClassDesignInterfaces.bikeproject.bikeproject.src.bikeproject;

public interface MountainParts {

    String TERRAIN = "off_road";

    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}
