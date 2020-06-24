package programming.section4.recursion;

/**
 @author Aleksandr Ilin
 */

public class Linear {

    public static double factorial(double d) {

        if (d <= 1) {
            return 1;
        }else {
            return d * factorial(d - 1);
        }
    }
}
