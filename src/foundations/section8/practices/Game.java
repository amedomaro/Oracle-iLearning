package foundations.section8.practices;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // name each team
    // score each team

    private static int numGame;
    private static List<Game> games = new ArrayList<>();


    private Game(Team team1, Team team2) {
        numGame++;
    }

    private void playGame() {

    }

    protected void addGame(Team team1, Team team2) {
        games.add(new Game(team1, team1));
    }

    protected List<Game> getGames() {
        return games;
    }

    protected static int getNumGame() {                     // Below getters and setters
        return numGame;
    }

}
