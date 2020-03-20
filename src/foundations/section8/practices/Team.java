package foundations.section8.practices;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private int win, loss, tie, goalScored, goalAllowed;
    private static List<Team> team = new ArrayList<>();

    public Team(String name) {
        setName(name);
    }

    protected static void addTeam(Team team) {
        if (!Team.team.contains(team)) {
            Team.team.add(team);
        } else {
            System.out.printf("ERROR!\n%s team is already on the list\n", team.getName());
        }
    }

    // Below getters, setters and Override

    protected static List<Team> getList() {
        return team;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getWin() {
        return win;
    }

    protected void setWin(int win) {
        if (win > 0) {
            this.win = win;
        }
    }

    protected int getLoss() {
        return loss;
    }

    protected void setLoss(int loss) {
        if (loss > 0) {
            this.loss = loss;
        }
    }

    protected int getTie() {
        return tie;
    }

    protected void setTie(int tie) {
        if (tie > 0) {
            this.tie = tie;
        }
    }

    protected int getGoalScored() {
        return goalScored;
    }

    protected void setGoalScored(int goalScored) {
        if (goalScored > 0) {
            this.goalScored = goalScored;
        }
    }

    protected int getGoalAllowed() {
        return goalAllowed;
    }

    protected void setGoalAllowed(int goalAllowed) {
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
