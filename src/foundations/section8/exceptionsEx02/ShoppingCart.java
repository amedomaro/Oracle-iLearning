package foundations.section8.exceptionsEx02;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.printf("Add Result: %d\n\n", addResult);

        double divResult = calc.divide(15, 0);
        System.out.printf("Division Result: %.2f\n\n", divResult);

    }
}
