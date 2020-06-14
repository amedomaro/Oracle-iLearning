package foundations.section8.practices;

/**
 @author Aleksandr Ilin
 */

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scheduler scheduler = new Scheduler();

        Team.addTeam(new Team("Zenit"));           // Create team
        Team.addTeam(new Team("Spartak"));
        Team.addTeam(new Team("CSK"));
        Team.addTeam(new Team("Dinamo"));

        scheduler.season();
        Temperature.showTemperatureSeason();

        new InputNumber().br.close();
    }
}
