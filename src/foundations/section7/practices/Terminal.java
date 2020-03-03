package foundations.section7.practices;


public class Terminal {
    private String[][] arr = {{"0", "exit"}, {"Bear", "10"}, {"Clock", "25"}, {"Certificate", "50"}};

    public void putMoney(Card card, double money) {
        card.setCredit(card.getCredit() + (money / 2));
    }

    public void checkBalance(Card card) {
        System.out.println(card.toString());
    }

    public void creditTransfer(Card first, Card second) {
        double num;

        System.out.printf("Enter the amount of credits that you want to transfer from the card № %d to the card № %d: ",
                first.getNumber(), second.getNumber());

        while (true) {
            num = new Number().getDouble();

            if (num <= first.getCredit()) {
                first.setCredit(first.getCredit() - num);
                second.setCredit(second.getCredit() + num);
                System.out.printf("Success. To the card: %d credited: %.2f credits\n", second.getNumber(), num);
                break;
            } else {
                System.out.print("Not enough money, top up your balance!\nEnter again: ");
            }
        }
    }

    public void ticketTransfer(Card first, Card second) {
        int num;

        System.out.printf("Enter the amount of tickets that you want to transfer from the card %d to the card %d: ",
                first.getNumber(), second.getNumber());

        while (true) {
            num = new Number().getInteger();

            if (num <= first.getTicket()) {
                first.setTicket(first.getTicket() - num);
                second.setTicket(second.getTicket() + num);
                System.out.printf("Success. To the card: %d credited: %d credits\n\n", second.getNumber(), num);
                break;
            } else {
                System.out.print("Not enough ticket, top up your balance!\nEnter again: ");
            }
        }
    }

    public void getPrize(Card card) {
        int num;

        System.out.printf("select Prize:\n [0] %s - %s\n [1] %s - %s tickets\n [2] %s - %s tickets\n [3] %s - %s tickets\n",
                arr[0][0], arr[0][1], arr[1][0], arr[1][1], arr[2][0], arr[2][1], arr[3][0], arr[3][1]);
        System.out.print("Insert the number: ");

        while (true) {
            num = new Number().getInteger();

            if (num == 0){
                break;
            }

            if ((num > 0 && num < 4) && (card.getTicket() >= Integer.parseInt(arr[num][1]))) {
                card.setTicket(card.getTicket() - num);
                System.out.printf("WoW! You are getting: %s\n\n", arr[num][0]);
                break;
            } else if (num < 0 || num > 3){
                System.out.print("Incorrect number entered\nEnter again: ");
            } else {
                System.out.print("Not enough ticket\nEnter again: ");
            }
        }
    }
}
