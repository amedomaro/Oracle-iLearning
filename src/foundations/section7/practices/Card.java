package foundations.section7.practices;

public class Card {

    private static int count;
    private int ticket, number;
    private double credit;

    public Card() {
        count++;
        setNumber(count);
    }

    protected int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    protected int getTicket() {
        return ticket;
    }

    protected void setTicket(int ticket) {
        if (ticket >= 0) {
            this.ticket = ticket;
        } else {
            System.out.printf("ERROR!\n%d is negative number !!!\n", ticket);
        }
    }

    protected double getCredit() {
        return credit;
    }

    protected void setCredit(double credit) {
        if (credit >= 0) {
            this.credit = credit;
        } else {
            System.out.printf("ERROR!\n%.2f is negative number !!!\n", credit);
        }
    }

    @Override
    public String toString() {
        return String.format("Card number: %2d\nCredit: %10.2f\nTicket: %8d\n", getNumber(), getCredit(), getTicket());
    }
}
