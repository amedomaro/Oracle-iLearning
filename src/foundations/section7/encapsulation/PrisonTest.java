package foundations.section7.encapsulation;

public class PrisonTest {

    public static void main(String[] args) {

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, "001");

        System.out.println(bubba.toString());
        System.out.println(twitch.toString());

        bubba.display();
        twitch.display();
    }
}
