package programming.section4.recursion;

public class NonLinear {

    public static double fibonacci(double d) {
        double value;

        if (d < 2) {
            return d;
        } else {
            value = fibonacci(d - 1) + fibonacci(d - 2);
            System.out.printf("Fibonacci index [%.1f] value [%.1f]\n", d, value);
            return value;
        }
    }

    public static void main(String[] args) {

        NonLinear.fibonacci(5);
    }
}
