package foundations.section8.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private static int count;
    private int numGame = 1, goalTeam1, goalTeam2;
    private double temperature;
    private String teamName1, teamName2;
    private Random random = new Random();
    private static List<Game> games = new ArrayList<>();

    protected Game(Team team1, Team team2) {
        temperature = Temperature.getTemperature();
        setTeamName1(team1.getName());
        setTeamName2(team2.getName());
        numGame += count++;
        playGame(team1, team2);
    }

    protected void playGame(Team team1, Team team2) {

        if (Temperature.getTemperature() < 15) {
            setGoalTeam1(random.nextInt(7));
            setGoalTeam2(random.nextInt(7));

        } else if (Temperature.getTemperature() < 30) {
            setGoalTeam1(random.nextInt(5));
            setGoalTeam2(random.nextInt(5));

        } else {
            setGoalTeam1(random.nextInt(3));
            setGoalTeam2(random.nextInt(3));
        }

        team1.setGoalScored(team1.getGoalScored() + goalTeam1);                  // adding scored goals
        team2.setGoalScored(team2.getGoalScored() + goalTeam2);

        team1.setGoalAllowed(team1.getGoalScored() + random.nextInt(2));  // adding unscored goals
        team2.setGoalAllowed(team2.getGoalScored() + random.nextInt(2));

        if (getGoalTeam1() > getGoalTeam2()) {
            team1.setWin(team1.getWin() + 1);
            team2.setLoss(team2.getLoss() + 1);

        } else if (getGoalTeam1() < getGoalTeam2()) {
            team2.setWin(team2.getWin() + 1);
            team1.setLoss(team1.getLoss() + 1);

        } else {
            team1.setTie(team1.getTie() + 1);
            team2.setTie(team2.getTie() + 1);
        }

        games.add(this);
    }

    protected static List<Game> getGames() {                       // Below getters, setters and Override
        return games;
    }

    private int getNumGame() {
        return numGame;
    }

    private String getTeamName1() {
        return teamName1;
    }

    private void setTeamName1(String teamName1) {
        this.teamName1 = teamName1;
    }

    private String getTeamName2() {
        return teamName2;
    }

    private void setTeamName2(String teamName2) {
        this.teamName2 = teamName2;
    }

    private int getGoalTeam1() {
        return goalTeam1;
    }

    private void setGoalTeam1(int goalTeam1) {
        this.goalTeam1 = goalTeam1;
    }

    private int getGoalTeam2() {
        return goalTeam2;
    }

    private void setGoalTeam2(int goalTeam2) {
        this.goalTeam2 = goalTeam2;
    }

    @Override
    public String toString() {
        return String.format("Game#%d\nTemperature: %.1f\nTeams: %s - %s\nGame Score: %d - %d\n",
                getNumGame(), temperature, getTeamName1(), getTeamName2(), getGoalTeam1(), getGoalTeam2());
    }
}
