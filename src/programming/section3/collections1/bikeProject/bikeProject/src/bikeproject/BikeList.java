package programming.section3.collections1.bikeProject.bikeProject.src.bikeproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BikeList {

//    private int mountainBikeSales = 0;
//    private int roadBikeSales = 0;
    private List<Bike> bikes = new ArrayList<>();


    protected void fillArray(List<Bike> bikes){
        Random random = new Random();

        for (int i = 0; i < 10; i++){

            if(random.nextInt(2) < 1){
                bikes.add(new MountainBike());
            } else {
                bikes.add(new RoadBike());
            }
        }
    }

    protected void displayStock(List<Bike> bikes){
        for (Bike bike : bikes){
            System.out.println(bike.toString());
        }
    }

    private int calculateStock(List<Bike> bikes){
        int bikesSold = 0;

        for (Bike bike : bikes){
            bikesSold += (bike instanceof MountainBike) ? 1 : 0;
        }

        return bikesSold;
    }

    protected void displayBikeNumber(){
        int mb = calculateStock(bikes);
        int rb = bikes.size() - mb;

        System.out.printf("\nStock Levels\nWe have %d Mountain Bikes in stock\nWe have %d Road Bikes in stock\n", mb, rb);
    }

    public static void main(String[] args) {
        BikeList bikeList = new BikeList();

        bikeList.fillArray(bikeList.bikes);
        bikeList.displayStock(bikeList.bikes);
        bikeList.displayBikeNumber();

    }
}
