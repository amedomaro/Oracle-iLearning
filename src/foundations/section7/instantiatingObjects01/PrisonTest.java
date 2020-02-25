package foundations.section7.instantiatingObjects01;

public class PrisonTest {

    public static void main(String[] args) {

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);

        System.out.println(bubba.toString());
        System.out.println(twitch.toString());

        System.out.println("-------= Part 2 =-------");

        System.out.println(bubba == twitch);  // equals() ...
        twitch.refactorPrisoner("Bubba", 2.08, 4);
        System.out.println(bubba == twitch);  // equals() ...

    }
}
