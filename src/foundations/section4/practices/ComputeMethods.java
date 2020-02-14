package foundations.section4.practices;

import java.util.Random;

public class ComputeMethods {

    public double fToC(double degreesF) {
        return (double) 5 / 9 * (degreesF - 32);
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int roll() {
        Random random = new Random();
        return (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
    }
}
