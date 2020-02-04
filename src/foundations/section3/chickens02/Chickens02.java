package foundations.section3.chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        double dailyAverage = (100 + 121 + 117) / 3.0;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = 0.18 * monthlyAverage;

        //Don't edit these print statements
        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }

}
