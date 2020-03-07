package foundations.section8.practices;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Team.addTeam("Zenit", new Team("Zenit"));           // Create team
        Team.addTeam("Spartak", new Team("Spartak"));
        Team.addTeam("CSK", new Team("CSK"));
        Team.addTeam("Dinamo", new Team("Dinamo"));


        for (Map.Entry<String, Team> team : Team.getMap().entrySet()) {  // Print statistic
            System.out.println(team.getValue());
        }
    }
}
