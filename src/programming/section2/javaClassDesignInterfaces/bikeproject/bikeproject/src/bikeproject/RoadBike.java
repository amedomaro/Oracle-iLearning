package programming.section2.javaClassDesignInterfaces.bikeproject.bikeproject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public class RoadBike extends Bike implements RoadParts{  // Реализация интерфейса в классе
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription

	@Override
	public int getTyreWidth() {
		return tyreWidth;
	}

	@Override
	public void setTyreWidth(int newValue) {
		tyreWidth = newValue;
	}

	@Override
	public int getPostHeight() {
		return postHeight;
	}

	@Override
	public void setPostHeight(int newValue) {
		postHeight = newValue;
	}
}//end class RoadBike
