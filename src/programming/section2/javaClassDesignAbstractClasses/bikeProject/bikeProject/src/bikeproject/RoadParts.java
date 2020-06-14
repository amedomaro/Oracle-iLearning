package programming.section2.javaClassDesignAbstractClasses.bikeProject.bikeProject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public interface RoadParts {

    String TERRAIN = "track_racing";

    int getTyreWidth();
    void setTyreWidth(int newValue);
    int getPostHeight();
    void setPostHeight(int newValue);

}
