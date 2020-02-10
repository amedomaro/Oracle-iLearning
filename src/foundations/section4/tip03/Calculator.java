package foundations.section4.tip03;

public class Calculator {
    public double tax = .05;
    public double tip = .15;

    public void findTotal(String name, double price) {
        double total = price * (1 + tax + tip);
        System.out.printf("%s: $%.2f\n", name, total);

    }
}
