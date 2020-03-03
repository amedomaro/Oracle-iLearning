package foundations.section7.practices;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Terminal terminal = new Terminal();
        FirstGame game1 = new FirstGame();

        Card card1 = new Card();
        Card card2 = new Card();

        terminal.putMoney(card1, 65);
        terminal.putMoney(card2, 40);

        game1.Swiping(card1);
        game1.Swiping(card1);
        game1.Swiping(card1);

        game1.Swiping(card2);
        game1.Swiping(card2);
        game1.Swiping(card2);

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
