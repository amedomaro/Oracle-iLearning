package programming.section2.javaClassDesignAbstractClasses.bikeProject.bikeProject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int numGears;

    public Bike() {
    }//end constructor

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.numGears = numGears;
    }//end constructor

    @Override
    public String getHandleBars() {
        return handleBars;
    }

    @Override
    public void setHandleBars(String newValue) {
        this.handleBars = newValue;
    }

    @Override
    public String getTyres() {
        return tyres;
    }

    @Override
    public void setTyres(String newValue) {
        this.tyres = newValue;
    }

    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public void setSeatType(String newValue) {
        this.seatType = newValue;
    }


    @Override
    public String toString() {
        return String.format("%s \nThis bike has %s handlebars on a %s frame with %d gears.\nIt has a %s seat with %s tyres.",
                MAKE, handleBars, frame, numGears, seatType, tyres);
    }
}//end class Bike
	
	

