package programming.section3.collections1.bikeProject.bikeProject.src.bikeproject;

/**
 @author Aleksandr Ilin
 */

public class BikeDriver {

    public static void main(String[] args) {

        RoadBike bike1 = new RoadBike();
        RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort",
                14, 25, 18);
        MountainBike bike3 = new MountainBike();

        bike1.setPostHeight(20);

        System.out.println(bike1.toString());
        System.out.println(bike2.toString());
        System.out.println(bike3.toString());
    }

}
