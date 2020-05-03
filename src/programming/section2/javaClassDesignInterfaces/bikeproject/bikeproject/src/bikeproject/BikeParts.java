package programming.section2.javaClassDesignInterfaces.bikeproject.bikeproject.src.bikeproject;

public interface BikeParts {

    String MAKE = "Oracle Bikes";

    String getHandleBars();
    void setHandleBars(String newValue);
    String getTyres();
    void setTyres(String newValue);
    String getSeatType();
    void setSeatType(String newValue);

}
