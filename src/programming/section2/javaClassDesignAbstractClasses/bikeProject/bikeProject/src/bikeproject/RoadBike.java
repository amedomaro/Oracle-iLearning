package programming.section2.javaClassDesignAbstractClasses.bikeProject.bikeProject.src.bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
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

	@Override
	public int getTyreWidth() {
		return tyreWidth;
	}

	@Override
	public void setTyreWidth(int newValue) {
		this.tyreWidth = newValue;
	}

	@Override
	public int getPostHeight() {
		return postHeight;
	}

	@Override
	public void setPostHeight(int newValue) {
		this.postHeight = newValue;
	}

	@Override
	public String toString(){
		return String.format("This RoadBike bike has %dmm tyres and a post height of %d.", tyreWidth, postHeight);
	}
}//end class RoadBike
