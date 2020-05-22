package programming.section4.recursion;

public class Linear {

    public static double factorial(double d) {

        if (d <= 1) {
            return 1;
        }

        return d * factorial(d - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
