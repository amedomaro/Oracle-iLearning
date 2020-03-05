package foundations.section8.exceptionsEx02;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Division by 0 is prohibited!");
            return 0;
        }
        return x / y;
    }
}
