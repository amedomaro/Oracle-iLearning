package foundations.section7.practices;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Terminal terminal = new Terminal();
        Game game = new Game();

        Card card1 = new Card();
        Card card2 = new Card();

        terminal.putMoney(card1, 65);
        terminal.putMoney(card2, 40);

        game.Swiping(card1);
        game.Swiping(card1);
        game.Swiping(card1);

        game.Swiping(card2);
        game.Swiping(card2);
        game.Swiping(card2);

        terminal.checkBalance(card1);
        terminal.checkBalance(card2);

        terminal.creditTransfer(card1, card2);
        terminal.ticketTransfer(card2, card1);

        terminal.checkBalance(card1);
        terminal.checkBalance(card2);

        terminal.getPrize(card1);

        new Number().br.close();
    }
}
