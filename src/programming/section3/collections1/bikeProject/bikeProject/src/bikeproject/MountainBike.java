package programming.section3.collections1.bikeProject.bikeProject.src.bikeproject;

public class MountainBike extends Bike implements MountainParts{

	private String suspension, type;
	private int frameSize;
	
	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor
	
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, 
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor


	@Override
	public String getSuspension() {
		return suspension;
	}

	@Override
	public void setSuspension(String newValue) {
		this.suspension = newValue;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String newValue) {
		this.type = newValue;
	}

	@Override
	public String toString(){
		return String.format("\n%s\nThis mountain bike is a %s bike and has a %s suspension and a frame size of %d inches.",
				MAKE, type, suspension, frameSize) + "\nThis bike is best for " + TERRAIN;
	}
}//end class MountainBike
