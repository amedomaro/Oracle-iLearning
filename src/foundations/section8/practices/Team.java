package foundations.section8.practices;

import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private int win, loss, tie, goalScored, goalAllowed;
    private static Map<String, Team> team = new HashMap<>();

    public Team(String name) {
        setName(name);
    }

    protected static Team getTeam(String name) {
        return Team.team.get(name);
    }

    protected static Map<String, Team> getMap() {
        return team;
    }

    protected static void addTeam(String name, Team team) {
        if (!Team.team.containsKey(name)) {
            Team.team.put(name, team);
        } else {
            System.out.printf("ERROR!\n%s team already exists!\n\n", name);
        }
    }

    protected static void removeTeam(String name) {
        Team.team.remove(name);
    }


    protected String getName() {                            // Below getters, setters and Override
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getWin() {
        return win;
    }

    private void setWin(int win) {
        if (win > 0) {
            this.win = win;
        }
    }

    protected int getLoss() {
        return loss;
    }

    private void setLoss(int loss) {
        if (loss > 0) {
            this.loss = loss;
        }
    }

    protected int getTie() {
        return tie;
    }

    private void setTie(int tie) {
        if (tie > 0) {
            this.tie = tie;
        }
    }

    protected int getGoalScored() {
        return goalScored;
    }

    private void setGoalScored(int goalScored) {
        if (goalScored > 0) {
            this.goalScored = goalScored;
        }
    }

    protected int getGoalAllowed() {
        return goalAllowed;
    }

    private void setGoalAllowed(int goalAllowed) {
        if (goalAllowed > 0) {
            this.goalAllowed = goalAllowed;
        }
    }

    @Override
    public String toString() {
        return String.format("Team: %s\nWins: %d, Losses: %d, Ties: %d\nPoints Scored: %d, Points Allowed: %d\n",
                getName(), getWin(), getLoss(), getTie(), getGoalScored(), getGoalAllowed());
    }
}
