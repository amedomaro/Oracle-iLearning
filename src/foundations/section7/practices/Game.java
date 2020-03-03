package foundations.section7.practices;

public abstract class Game {
    protected double cost;

    protected void Swiping(Card card) {
        if (card.getCredit() - cost >= 0) {
            card.setCredit(card.getCredit() - cost);
            card.setTicket(card.getTicket() + game(card));
        } else {
            System.out.println("Not enough money, top up your balance!\n");
        }
    }

    abstract int game(Card card);
}
