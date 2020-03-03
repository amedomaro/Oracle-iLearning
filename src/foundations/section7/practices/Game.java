package foundations.section7.practices;

import java.util.Random;

public class Game {
    protected double cost = 10;
    private int points;
    int[] arr = {5, 10, 25};

    protected void Swiping(Card card) {
        if (card.getCredit() - cost >= 0) {
            card.setCredit(card.getCredit() - cost);
            card.setTicket(card.getTicket() + game(card));
        } else {
            System.out.println("Not enough money, top up your balance!\n");
        }
    }

    private int game(Card card) {
        int win;

        /*
         *
         *  Very interesting game logic ...
         *
         */

        Random random = new Random();
        setPoints(random.nextInt(1000));

        if (getPoints() < 300) {
            win = arr[0];
        } else if (getPoints() < 700) {
            win = arr[1];
        } else {
            win = arr[2];
        }

        System.out.printf("Card № %d\nYour winnings amounted to: %d ticket\n\n", card.getNumber(), win);
        return win;
    }

    protected void setCost(double cost) {
        this.cost = cost;
    }

    private int getPoints() {
        return points;
    }

    private void setPoints(int points) {
        this.points = points;
    }
}
