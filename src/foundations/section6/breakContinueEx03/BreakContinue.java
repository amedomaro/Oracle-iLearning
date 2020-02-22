package foundations.section6.breakContinueEx03;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println("The number is " + i);

            if (i == 7) {
                break;
            }
        }
    }
}
