package programming.section4.recursion;

public class Linear {

    public static double factorial(double d) {

        if (d <= 1) {
            return 1;
        }else {
            return d * factorial(d - 1);
        }
    }

    public static void main(String[] args) {
        double d = 5;

        System.out.printf("Factorial [%.1f] of [%.1f]",Linear.factorial(5), d);
    }
}
