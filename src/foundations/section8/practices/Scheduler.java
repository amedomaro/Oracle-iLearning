package foundations.section8.practices;

import java.util.Collections;

public class Scheduler {
    private InputNumber inputNum = new InputNumber();

    protected void season() {
        int count = 0;

        System.out.println("If there are 3 consecutive weeks of freezing temperatures, " +
                "then winter has arrived and the season is over.");

        while (count != 3) {
            System.out.print("\nWhat temperature today?\nEnter the value here: ");
            Temperature.setTemperature(inputNum.getDouble());

            if (Temperature.getTemperature() < 0 && Temperature.getTemperature() != Double.MIN_VALUE) {
                System.out.println("Too cold to play.");
                count++;

            } else if (Temperature.getTemperature() >= 0){
                count = 0;
                toss();
                Temperature.setTemperature(Double.MIN_VALUE);
            }
        }

        System.out.println("Season is over\n\n*********RESULTS*********\n\n");

        for (Team team : Team.getList()) {  // Print statistic
            System.out.println(team);
        }

        for (Game game : Game.getGames()) {  // Print games
            System.out.println(game);
        }
    }

    private void toss() {
        Collections.shuffle(Team.getList());

        if (Team.getList().size() > 1) {

            if (Team.getList().size() % 2 == 0) {           // If the number of teams is even
                for (int i = 0; i < Team.getList().size(); i += 2) {
                    Game game = new Game(Team.getList().get(i), Team.getList().get(i + 1));
                }

            } else {                                        // If the number of teams is odd
                for (int i = 0; i < Team.getList().size() - 1; i += 2) {
                    Game game = new Game(Team.getList().get(i), Team.getList().get(i + 1));
                }

                Game game = new Game(Team.getList().get(0), Team.getList().get(Team.getList().size() - 1));
            }
        }
    }
}
