package foundations.section7.practices;

import java.util.Random;

public class FirstGame extends Game {
    private int points;
    private int[] winTicket = {5, 10, 25};

    protected FirstGame() {
        super.cost = 10;
    }

    @Override
    protected int game(Card card) {
        int win;

        /*
         *
         *  Very interesting game logic ...
         *
         */

        Random random = new Random();           // TEST !!!
        setPoints(random.nextInt(1000)); // emulate the end of the game

        if (getPoints() < 300) {
            win = winTicket[0];
        } else if (getPoints() < 700) {
            win = winTicket[1];
        } else {
            win = winTicket[2];
        }

        System.out.printf("Card № %d\nYour winnings amounted to: %d ticket\n\n", card.getNumber(), win);
        return win;
    }

    private int getPoints() {
        return points;
    }

    private void setPoints(int points) {
        this.points = points;
    }
}
