package foundations.section3.chickens01;

public class FarmEggs {

    private int totalEggs;

    public void countTotalEggs(int eggsPerChicken, int chickenCount){
        totalEggs = chickenCount * eggsPerChicken; // Monday
        totalEggs += (++chickenCount) * eggsPerChicken; // Tuesday
        totalEggs += (chickenCount / 2) * eggsPerChicken; //Wednesday
        System.out.println(totalEggs);
    }


}
