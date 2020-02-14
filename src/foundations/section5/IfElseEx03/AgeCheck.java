package foundations.section5.IfElseEx03;

public class AgeCheck {

    public static void main(String[] args) {
        int myAge = 19;   // I am 19; let me see if I can drive yet

        if (myAge >= 16) {
            System.out.println("I'm old enough to have a driver's license!");
        } else if (myAge <= 16) {
            System.out.println("I'm not old enough yet... :*(");
        }
    }
}
