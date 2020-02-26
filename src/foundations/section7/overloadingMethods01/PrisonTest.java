package foundations.section7.overloadingMethods01;

public class PrisonTest {

    public static void main(String[] args) {

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);

        System.out.println(bubba.toString());
        System.out.println(twitch.toString());

        Prisoner p02 = new Prisoner();
        System.out.println(p02.toString());
    }
}
